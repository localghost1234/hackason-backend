package com.desiertofirewall.hackason.backend.services;

import com.desiertofirewall.hackason.backend.models.Program;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProgramsService {

    private final List<Program> mockPrograms = Arrays.asList();

    public List<Program> getAllPrograms() {
        return mockPrograms;
    }
}