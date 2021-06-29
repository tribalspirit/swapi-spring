package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resources_people")
public class People {
    @Column (name = "ID")
    @Id
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

    @Column (name = "height", nullable = true)
    private String height;

    @Column (name = "mass", nullable = true)
    private String mass;

    @Column (name = "hair_color", nullable = true)
    private String hair_color;

    @Column (name = "skin_color", nullable = true)
    private String skin_color;

    @Column (name = "eye_color", nullable = true)
    private String eye_color;

    @Column (name = "birth_year", nullable = true)
    private String birth_year;

    @Column (name = "gender", nullable = true)
    private String gender;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_characters",
            joinColumns = @JoinColumn(name = "people_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_species_people",
            joinColumns = @JoinColumn(name = "people_id"),
            inverseJoinColumns = @JoinColumn(name = "species_id"))
    private List<Species> species;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_vehicles_pilots",
            joinColumns = @JoinColumn(name = "people_id"),
            inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
    private List<Vehicle> vehicles;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_starship_pilots",
            joinColumns = @JoinColumn(name = "people_id"),
            inverseJoinColumns = @JoinColumn(name = "starship_id"))
    private List<Starship> starships;

    public People() {
    }

    public People(Date createdAt, Date editedAt, String name, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender, List<Film> films, List<Species> species, List<Vehicle> vehicles, List<Starship> starships) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Starship> getStarships() {
        return starships;
    }

    public void setStarships(List<Starship> starships) {
        this.starships = starships;
    }
}
