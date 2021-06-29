package com.example.swapispring.controllers;

import com.example.swapispring.exceptions.ResourceNotFoundException;
import com.example.swapispring.models.Vehicle;
import com.example.swapispring.repositories.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class VehiclesController {
    @Autowired
    private VehiclesRepository vehiclesRepository;

    @GetMapping("/vehicles")
    public List<Vehicle> getAllUnits() {
        return vehiclesRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public ResponseEntity<Vehicle> getUnitsById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Vehicle unit =
                vehiclesRepository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok().body(unit);
    }
}
