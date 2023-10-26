package com.example.issuemanagementsystem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    // GEt //
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
