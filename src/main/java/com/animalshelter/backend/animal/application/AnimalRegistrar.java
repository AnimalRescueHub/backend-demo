package com.animalshelter.backend.animal.application;

import com.animalshelter.backend.animal.domain.AnimalImageRepository;
import com.animalshelter.backend.animal.domain.AnimalRepository;
import com.animalshelter.backend.animal.domain.entity.Animal;
import com.animalshelter.backend.animal.domain.entity.AnimalType;

public class AnimalRegistrar {

    private final AnimalRepository animalRepository;
    private final AnimalImageRepository animalImageRepository;

    public AnimalRegistrar(AnimalRepository animalRepository, AnimalImageRepository animalImageRepository) {
        this.animalRepository = animalRepository;
        this.animalImageRepository = animalImageRepository;
    }

    public void execute(CreateAnimalCommand command) {
        String imageUrl = animalImageRepository.saveImage(command.image());
        animalRepository.saveAnimal(new Animal(AnimalType.findById(command.animalType()), command.name(), imageUrl));
    }

}
