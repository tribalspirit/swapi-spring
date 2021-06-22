package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.persistence.JoinColumn;
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

    @Column (name = "url", nullable = true)
    private String gender;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resource_films_planets",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id"))
    private List<Planet> planets;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resource_films_characters",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "people_id"))
    private List<People> characters;

    public Planet() {
    }

    public Planet(Date createdAt, Date editedAt, String name, String diameter, String rotationPeriod, String orbitalPeriod, String gravity, String climate, String surfaceWater, String gender, List<Planet> planets, List<People> characters) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.name = name;
        this.diameter = diameter;
        this.rotationPeriod = rotationPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.gravity = gravity;
        this.climate = climate;
        this.surfaceWater = surfaceWater;
        this.gender = gender;
        this.planets = planets;
        this.characters = characters;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public List<People> getCharacters() {
        return characters;
    }

    public void setCharacters(List<People> characters) {
        this.characters = characters;
    }
}
