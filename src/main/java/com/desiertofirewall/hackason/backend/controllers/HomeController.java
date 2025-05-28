package com.desiertofirewall.hackason.backend.controllers;  // Adjust to your package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hackason API Server. Unauthorized Access WILL Be Punished!";
    }
}
