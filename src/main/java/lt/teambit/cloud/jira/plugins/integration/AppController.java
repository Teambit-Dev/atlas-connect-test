package lt.teambit.cloud.jira.plugins.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @GetMapping("/atlaskit")
    public String atlaskit() {
        return "atlaskit";
    }
}