package com.desiertofirewall.hackason.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desiertofirewall.hackason.backend.models.Challenge;
import com.desiertofirewall.hackason.backend.services.ChallengeService;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {
    
    private final ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public List<Challenge> getAllChallenges() {
        return challengeService.getAllChallenges();
    }
}