package com.desiertofirewall.hackason.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Lombok: Auto-generates getters, setters, toString(), etc.
@NoArgsConstructor  // Lombok: Default constructor
@AllArgsConstructor // Lombok: Constructor with all fields
public class Challenge {
    private String id;          // Unique identifier (e.g., "xss-1")
    private String title;       // Challenge name (e.g., "DOM XSS Challenge")
    private String description; // Detailed instructions
    private String category;    // e.g., "Web Security", "Cryptography"
    private String difficulty;  // e.g., "Easy", "Medium", "Hard"
    private int points;         // Reward points (e.g., 250)
    private boolean isActive;   // Whether the challenge is available
    private String vmUrl;       // URL to the vulnerable demo (optional)
}