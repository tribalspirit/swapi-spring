package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.Starship;
import com.example.swapispring.repositories.StarshipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StarshipsController {
    @Autowired
    private StarshipsRepository starshipsRepository;

    @GetMapping("/starships")
    public List<Starship> getAllUnits() {
        return starshipsRepository.findAll();
    }

    @GetMapping("/starships/{id}")
    public ResponseEntity<Starship> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Starship unit =
                starshipsRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
