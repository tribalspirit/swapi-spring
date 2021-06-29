package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.Film;
import com.example.swapispring.repositories.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class FilmsController {
    @Autowired
    private FilmsRepository filmsRepository;

    @GetMapping("/films")
    public List<Film> getAllUnits() {
        return filmsRepository.findAll();
    }

    @GetMapping("/films/{id}")
    public ResponseEntity<Film> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Film unit =
                filmsRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
