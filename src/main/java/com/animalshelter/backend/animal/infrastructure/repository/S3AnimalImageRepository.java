package com.animalshelter.backend.animal.infrastructure.repository;

import com.animalshelter.backend.animal.domain.AnimalImageRepository;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class S3AnimalImageRepository implements AnimalImageRepository {

    @Override
    public String saveImage(File animalImage) {
        return "imageUrl";
    }
}
