package com.desiertofirewall.hackason.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Challenge {
    private String id;
    private String title;
    private String description;
    private String category;
    private String difficulty;
    private int points;
    private boolean isActive;
    private String vmUrl;
}