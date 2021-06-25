package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resources_species")
public class Species {
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

    @Column (name = "classification", nullable = true)
    private String classification;

    @Column (name = "designation", nullable = true)
    private String designation;

    @Column (name = "average_height", nullable = true)
    private String averageHeight;

    @Column (name = "average_lifespan", nullable = true)
    private String averageLifespan;

    @Column (name = "hair_colors", nullable = true)
    private String hairColors;

    @Column (name = "skin_colors", nullable = true)
    private String skinColors;

    @Column (name = "eye_colors", nullable = true)
    private String eyeColors;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="resources_planet")
    private Planet homeworkd;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_species_people",
            joinColumns = @JoinColumn(name = "species_id"),
            inverseJoinColumns = @JoinColumn(name = "people_id"))
    private List<People> people;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_species",
            joinColumns = @JoinColumn(name = "species_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    public Species() {
    }

    public Species(Date createdAt, Date editedAt, String name, String classification, String designation, String averageHeight, String averageLifespan, String hairColors, String skinColors, String eyeColors, Planet homeworld, List<People> people, List<Film> films) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.averageHeight = averageHeight;
        this.averageLifespan = averageLifespan;
        this.hairColors = hairColors;
        this.skinColors = skinColors;
        this.eyeColors = eyeColors;
        this.homeworkd = homeworld;
        this.people = people;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public Planet getHomeworkd() {
        return homeworkd;
    }

    public void setHomeworkd(Planet homeworkd) {
        this.homeworkd = homeworkd;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
