package com.animalshelter.backend.animal.application;

import java.io.File;

public record CreateAnimalCommand(String id, String name, Integer animalType, File image) {
}
