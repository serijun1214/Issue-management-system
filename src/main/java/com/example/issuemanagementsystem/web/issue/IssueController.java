package com.example.issuemanagementsystem.web.issue;

import com.example.issuemanagementsystem.domain.issue.IssueEntity;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IssueController {

    // GET /issue
    @GetMapping("/issues")
    public String showList(Model model) {
        var issueList = List.of(
            new IssueEntity(1, "概要1", "説明1"),
            new IssueEntity(2, "概要2", "説明2"),
            new IssueEntity(3, "概要3", "説明3")
        );
        model.addAttribute("issueList", issueList);
        return "issues/list";
    }
}
