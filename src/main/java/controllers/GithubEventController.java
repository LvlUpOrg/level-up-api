package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GithubEventController {

    @RequestMapping("/github")
    public String index() {
        return "I am your master!";
    }

    @RequestMapping("/github/commit-comment")
    public String commitComment() {
        return "Yay, got a commit comment event!";
    }

    @RequestMapping("/github/issue-comment")
    public String issueComment() {
        return "Yay, got an issue comment event!";
    }

    @RequestMapping("/github/pull-request-comment")
    public String pullRequestComment() {
        return "Yay, got a pull request comment event!";
    }

    @RequestMapping("/github/pull-request")
    public String pullRequest() {
        return "Yay, got a pull request event!";
    }

    @RequestMapping("/github/push")
    public String push() {
        return "Yay, got a push event!";
    }

    @RequestMapping("/github/status")
    public String status() {
        return "Yay, got a status event!";
    }

    @RequestMapping("/github/deployment-status")
    public String deploymentStatus() {
        return "Yay, got a deployment status event!";
    }

    @RequestMapping("/github/release")
    public String release() {
        return "Yay, got a release event!";
    }

    @RequestMapping("/github/issue")
    public String issue() {
        return "Yay, got an issue event!";
    }

    @RequestMapping("/github/fork")
    public String fork() {
        return "Yay, got a fork event!";
    }
}
