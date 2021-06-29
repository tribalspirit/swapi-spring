package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "resources_vehicle")
@Entity
public class Vehicle {
    @Column(name = "ID")
    @javax.persistence.Id
    @GeneratedValue
    private Long Id;

    @Column (name = "created")
    @CreatedDate
    private Date createdAt;

    @Column (name = "edited")
    @LastModifiedDate
    private Date editedAt;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "model", nullable = true)
    private String model;

    @Column (name = "vehicle_class", nullable = true)
    private String vehicle_class;

    @Column (name = "manufacturer", nullable = true)
    private String manufacturer;

    @Column (name = "cost_in_credits", nullable = true)
    private String price;

    @Column (name = "length", nullable = true)
    private String length;

    @Column (name = "crew", nullable = true)
    private String crew;

    @Column (name = "passengers", nullable = true)
    private String passengers;

    @Column (name = "max_atmosphering_speed", nullable = true)
    private String maxAtmospheringSpeed;

    @Column (name = "cargo_capacity", nullable = true)
    private String cargoCapacity;

    @Column (name = "consumables", nullable = true)
    private String consumables;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_vehicles",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_vehicle_pilots",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "people_id"))
    private List<People> pilots;
}