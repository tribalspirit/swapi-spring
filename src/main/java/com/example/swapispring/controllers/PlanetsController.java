package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.Planet;
import com.example.swapispring.repositories.PlanetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlanetsController {
    @Autowired
    private PlanetsRepository planetsRepository;

    @GetMapping("/planets")
    public List<Planet> getAllUnits() {
        return planetsRepository.findAll();
    }

    @GetMapping("/planets/{id}")
    public ResponseEntity<Planet> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Planet unit =
                planetsRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
