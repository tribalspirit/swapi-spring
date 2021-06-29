package com.example.swapispring.repositories;

import com.example.swapispring.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Film, Long> {
}
