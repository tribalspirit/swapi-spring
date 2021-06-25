package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resources_film")
public class Film {
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

    @Column (name = "title", nullable = false)
    private String title;

    @Column (name = "episode_id", nullable = false)
    private Integer episode_id;

    @Column (name = "opening_crawl", nullable = true)
    private String opening_crawl;

    @Column (name = "director", nullable = true)
    private String director;

    @Column (name = "producer", nullable = true)
    private String producer;

    @Column (name = "release_date", nullable = true)
    private String releaseDate;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_characters",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "people_id"))
    private List<People> characters;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_planets",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id"))
    private List<Planet> planets;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_starships",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "starship_id"))
    private List<Starship> starships;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "resources_film_species",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "sprcies_id"))
    private List<Species> species;

    public Film() {
    }

    public Film(Date createdAt, Date editedAt, String title, Integer episode_id, String opening_crawl, String director, String producer, String releaseDate, List<People> characters, List<Planet> planets, List<Starship> starships, List<Species> species) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.species = species;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(Integer episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<People> getCharacters() {
        return characters;
    }

    public void setCharacters(List<People> characters) {
        this.characters = characters;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Starship> getStarships() {
        return starships;
    }

    public void setStarships(List<Starship> starships) {
        this.starships = starships;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }
}
