package com.animalshelter.backend.animal.domain;

import com.animalshelter.backend.animal.domain.entity.Animal;

public interface AnimalRepository {

    void saveAnimal(final Animal animal);
}
