package com.desiertofirewall.hackason.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial {
    private String id;
    private String title;
    private String url;
    private String thumbnail;
    private String duration;
    private String difficulty;
    private String tech;
    private String category;
    private String description;
    private LocalDate datePosted;
}