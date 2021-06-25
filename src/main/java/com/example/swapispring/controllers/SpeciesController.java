package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.Species;
import com.example.swapispring.repositories.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SpeciesController {
    @Autowired
    private SpeciesRepository speciesRepository;

    @GetMapping("/species")
    public List<Species> getAllUnits() {
        return speciesRepository.findAll();
    }

    @GetMapping("/species/{id}")
    public ResponseEntity<Species> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Species unit =
                speciesRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
