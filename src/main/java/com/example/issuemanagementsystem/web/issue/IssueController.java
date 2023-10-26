package com.example.issuemanagementsystem.web.issue;

import com.example.issuemanagementsystem.domain.issue.IssueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IssueController {

    private final IssueService issueService = new IssueService();

    // GET /issue
    @GetMapping("/issues")
    public String showList(Model model) {

        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }
}
