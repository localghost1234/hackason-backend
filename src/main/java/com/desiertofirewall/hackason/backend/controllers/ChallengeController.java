package com.desiertofirewall.hackason.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeController {
    @GetMapping("/api/challenges")
    public String getChallenges() {
        return "XSS Challenge, SQLi Challenge...";
    }
}