package com.example.swapispring.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

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

    public Film() {
    }

    public Film(Date createdAt, Date editedAt, String title, Integer episode_id, String opening_crawl, String director, String producer) {
        this.createdAt = createdAt;
        this.editedAt = editedAt;
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
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
}
