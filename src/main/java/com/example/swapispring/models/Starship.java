package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resources_starships")
public class Starship {
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

    @Column (name = "starship_class", nullable = true)
    private String starship_class;

    @Column (name = "manufacturer", nullable = true)
    private String manufacturer;

    @Column (name = "length", nullable = true)
    private String length;

    @Column (name = "crew", nullable = true)
    private String crew;

    @Column (name = "passengers", nullable = true)
    private String passengers;

    @Column (name = "max_atmosphering_speed", nullable = true)
    private String maxAtmospheringSpeed;

    @Column (name = "hyperdrive_rating", nullable = true)
    private String hyperdriveRating;

    @Column (name = "MGLT", nullable = true)
    private String MGLT;

    @Column (name = "cost_in_credits", nullable = true)
    private String price;

    @Column (name = "cargo_capacity", nullable = true)
    private String cargoCapacity;

    @Column (name = "consumables", nullable = true)
    private String consumables;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_starships",
            joinColumns = @JoinColumn(name = "starship_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_starship_pilots",
            joinColumns = @JoinColumn(name = "starship_id"),
            inverseJoinColumns = @JoinColumn(name = "people_id"))
    private List<People> pilots;

    public Starship() {
    }

    public Starship(Date createdAt, Date editedAt, String name, String model, String starship_class, String manufacturer, String length, String crew, String price, String passengers, String maxAtmospheringSpeed, String hyperdriveRating, String MGLT, String cargoCapacity, String consumables, List<Film> films, List<People> pilots) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.name = name;
        this.model = model;
        this.starship_class = starship_class;
        this.manufacturer = manufacturer;
        this.length = length;
        this.crew = crew;
        this.price = price;
        this.passengers = passengers;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.hyperdriveRating = hyperdriveRating;
        this.MGLT = MGLT;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.films = films;
        this.pilots = pilots;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<People> getPilots() {
        return pilots;
    }

    public void setPilots(List<People> pilots) {
        this.pilots = pilots;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
