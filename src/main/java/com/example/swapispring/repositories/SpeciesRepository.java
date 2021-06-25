package com.example.swapispring.repositories;

import com.example.swapispring.models.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, Long> {
}