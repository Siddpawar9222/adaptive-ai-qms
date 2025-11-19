package com.techeazy.adaptiveaiqms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anomalies")
public class AnomalyDetectionController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Anomaly Detection Controller";
    }
}
