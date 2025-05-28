package com.desiertofirewall.hackason.backend.models;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Lombok: Auto-generates getters, setters, toString(), etc.
@NoArgsConstructor  // Lombok: Default constructor
@AllArgsConstructor // Lombok: Constructor with all fields
public class Program {
    private String id;
    private String name;
    private String logo;
    private String description;
    private boolean isPublic;
    private String category;
    private String url;
    private Date updatedAt;
    private List<String> inScope;
    private List<String> outScope;
    private Rewards rewards;
    private String policyUrl;
    private Date launchDate;


    @Data
    @AllArgsConstructor
    public class Rewards {
        private int critical;
        private int high;
        private int medium;
        private int low;
    }
}
