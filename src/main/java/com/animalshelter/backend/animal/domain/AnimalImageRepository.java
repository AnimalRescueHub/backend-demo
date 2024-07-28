package com.animalshelter.backend.animal.domain;

import com.animalshelter.backend.animal.domain.entity.Animal;

import java.io.File;

public interface AnimalImageRepository {

    String saveImage(final File animalImage);
}
