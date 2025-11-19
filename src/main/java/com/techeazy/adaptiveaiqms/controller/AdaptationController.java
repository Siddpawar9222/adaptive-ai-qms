package com.techeazy.adaptiveaiqms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adapt")
public class AdaptationController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Adaptation Controller-Techeazy-consulting Test CICD - Again" ;
    }

}
