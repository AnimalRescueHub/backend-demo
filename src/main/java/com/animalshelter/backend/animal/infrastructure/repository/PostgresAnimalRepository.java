package com.animalshelter.backend.animal.infrastructure.repository;

import com.animalshelter.backend.animal.domain.AnimalRepository;
import com.animalshelter.backend.animal.domain.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PostgresAnimalRepository implements AnimalRepository  {

    private final JPARepository jpaRepository;

    public PostgresAnimalRepository(JPARepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void saveAnimal(Animal animal) {
        jpaRepository.save(new AnimalEntity(UUID.randomUUID(), animal.type().typeId, animal.name(), animal.imageUrl()));
    }
}
