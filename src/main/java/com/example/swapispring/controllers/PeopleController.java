package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.People;
import com.example.swapispring.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PeopleController {
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping("/people")
    public List<People> getAllUnits() {
        return peopleRepository.findAll();
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<People> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        People unit =
                peopleRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
