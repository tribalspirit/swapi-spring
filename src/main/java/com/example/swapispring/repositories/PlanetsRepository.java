package com.example.swapispring.repositories;

import com.example.swapispring.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetsRepository extends JpaRepository<Planet, Long> {
}
