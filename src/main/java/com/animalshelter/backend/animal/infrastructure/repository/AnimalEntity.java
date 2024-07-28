package com.animalshelter.backend.animal.infrastructure.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.util.Objects;
import java.util.UUID;

@Entity
public class AnimalEntity {

    @Id
    @GeneratedValue
    private UUID id;
    private Integer type;
    private String name;
    private String imageUrl;

    public AnimalEntity() {
    }

    public AnimalEntity(UUID id, Integer type, String name, String imageUrl) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntity that = (AnimalEntity) o;
        return Objects.equals(id, that.id) && type == that.type && Objects.equals(name, that.name) && Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, imageUrl);
    }
}
