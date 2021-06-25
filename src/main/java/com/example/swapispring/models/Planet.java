package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resources_planet")
public class Planet {
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

    @Column (name = "diameter", nullable = true)
    private String diameter;

    @Column (name = "rotation_period", nullable = true)
    private String rotationPeriod;

    @Column (name = "orbital_period", nullable = true)
    private String orbitalPeriod;

    @Column (name = "gravity", nullable = true)
    private String gravity;

    @Column (name = "climate", nullable = true)
    private String climate;

    @Column (name = "surface_water", nullable = true)
    private String surfaceWater;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_planets",
            joinColumns = @JoinColumn(name = "planet_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    public Planet() {
    }

    public Planet(Date createdAt, Date editedAt, String name, String diameter, String rotationPeriod, String orbitalPeriod, String gravity, String climate, String surfaceWater, List<Film> films) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.name = name;
        this.diameter = diameter;
        this.rotationPeriod = rotationPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.gravity = gravity;
        this.climate = climate;
        this.surfaceWater = surfaceWater;
        this.films = films;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Date editedAt) {
        this.editedAt = editedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Planet> planets) {
        this.films = films;
    }

}
