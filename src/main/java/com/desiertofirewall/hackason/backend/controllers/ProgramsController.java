package com.desiertofirewall.hackason.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desiertofirewall.hackason.backend.models.Program;
import com.desiertofirewall.hackason.backend.services.ProgramsService;

@RestController
@RequestMapping("/api/programs")
public class ProgramsController {
    
    private final ProgramsService programsService;

    public ProgramsController(ProgramsService programsService) {
        this.programsService = programsService;
    }

    @GetMapping
    public List<Program> getAllPrograms() {
        return programsService.getAllPrograms();
    }
}