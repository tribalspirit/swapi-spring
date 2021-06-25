package com.example.swapispring.repositories;

import com.example.swapispring.models.Starship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarshipsRepository extends JpaRepository<Starship, Long> {
}