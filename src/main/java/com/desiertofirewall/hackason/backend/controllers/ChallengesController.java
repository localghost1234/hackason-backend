package com.desiertofirewall.hackason.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desiertofirewall.hackason.backend.models.Challenge;
import com.desiertofirewall.hackason.backend.services.ChallengesService;

@RestController
@RequestMapping("/api/challenges")
public class ChallengesController {
    
    private final ChallengesService challengesService;

    public ChallengesController(ChallengesService challengesService) {
        this.challengesService = challengesService;
    }

    @GetMapping
    public List<Challenge> getAllChallenges() {
        return challengesService.getAllChallenges();
    }
}