package lt.teambit.cloud.jira.plugins.integration.issue.model;

public class IssueEvent {
    private double timestamp;
    private String webhookEvent;
    private Issue issue;
    private Changelog changelog;

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public String getWebhookEvent() {
        return webhookEvent;
    }

    public void setWebhookEvent(String webhookEvent) {
        this.webhookEvent = webhookEvent;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public Changelog getChangelog() {
        return changelog;
    }

    public void setChangelog(Changelog changelog) {
        this.changelog = changelog;
    }

    @Override
    public String toString() {
        return "IssueEvent{" +
                "timestamp=" + timestamp +
                ", webhookEvent='" + webhookEvent + '\'' +
                ", issue=" + issue +
                ", changelog=" + changelog +
                '}';
    }
}
