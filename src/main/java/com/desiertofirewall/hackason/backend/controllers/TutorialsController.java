package com.desiertofirewall.hackason.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.desiertofirewall.hackason.backend.models.Tutorial;
import com.desiertofirewall.hackason.backend.services.TutorialsService;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialsController {

    private final TutorialsService tutorialsService;

    public TutorialsController(TutorialsService tutorialsService) {
        this.tutorialsService = tutorialsService;
    }

    @GetMapping
    public List<Tutorial> getAllTutorials() {
        return tutorialsService.getAllTutorials();
    }

    @GetMapping("/categories")
    public List<String> getUniqueCategories() {
        return tutorialsService.getUniqueCategories();
    }

    @GetMapping("/technologies")
    public List<String> getUniqueTechnologies() {
        return tutorialsService.getUniqueTechnologies();
    }

    @GetMapping("/filter/category")
    public List<Tutorial> getByCategory(@RequestParam String category) {
        return tutorialsService.getByCategory(category);
    }

    @GetMapping("/filter/technology")
    public List<Tutorial> getByTechnology(@RequestParam String tech) {
        return tutorialsService.getByTech(tech);
    }

    @GetMapping("/search")
    public List<Tutorial> searchTutorials(@RequestParam String query) {
        return tutorialsService.search(query);
    }
}
