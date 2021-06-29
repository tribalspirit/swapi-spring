package com.example.swapispring.repositories;

import com.example.swapispring.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicle, Long> {
}