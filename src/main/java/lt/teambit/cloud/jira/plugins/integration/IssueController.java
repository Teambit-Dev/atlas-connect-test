package lt.teambit.cloud.jira.plugins.integration;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.atlassian.connect.spring.AtlassianHostUser;
import lt.teambit.cloud.jira.plugins.integration.issue.model.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
class IssueController {

    private final AtlassianHostRestClients atlassianHostRestClients;

    IssueController(AtlassianHostRestClients atlassianHostRestClients) {
        this.atlassianHostRestClients = atlassianHostRestClients;
    }

    @GetMapping("/issue")
    String getIssue(@RequestParam String hostBaseUrl, @RequestParam String issueKey) {
        String url = hostBaseUrl + "/rest/api/3/issue/" + issueKey;
        Issue forObject = atlassianHostRestClients
                .authenticatedAsAddon()
                .getForObject(url, Issue.class);

        return forObject.toString();
    }

    @GetMapping("/issue/create")
    Issue create(@RequestParam String hostBaseUrl, @RequestParam String summary) {
        Issue issue = new Issue();

        Project project = new Project();
        project.setId("10000");
        IssueType issueType = new IssueType();
        issueType.setId("10001");

        IssueFields issueFields = new IssueFields();
        issueFields.setSummary(summary);
        issueFields.setIssuetype(issueType);
        issueFields.setProject(project);

        issue.setFields(issueFields);
        String url = hostBaseUrl + "/rest/api/3/issue";
        Issue forObject = atlassianHostRestClients
                .authenticatedAsAddon()
                .postForObject(url, issue, Issue.class);

        return forObject;
    }

    @PostMapping("/updated")
    public String updated(@RequestBody IssueEvent issueEvent, @AuthenticationPrincipal AtlassianHostUser hostUser) {
        IssueEvent issueEvent2 = issueEvent;
        return issueEvent.toString();
    }
}