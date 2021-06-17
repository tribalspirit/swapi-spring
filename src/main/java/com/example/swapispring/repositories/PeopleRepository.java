package com.example.swapispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.swapispring.models.People;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
