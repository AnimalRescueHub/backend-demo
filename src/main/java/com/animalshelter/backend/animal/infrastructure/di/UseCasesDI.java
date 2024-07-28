package com.animalshelter.backend.animal.infrastructure.di;

import com.animalshelter.backend.animal.application.AnimalRegistrar;
import com.animalshelter.backend.animal.domain.AnimalImageRepository;
import com.animalshelter.backend.animal.domain.AnimalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesDI {

    @Bean
    public AnimalRegistrar animalRegistrar(final AnimalRepository postgresAnimalRepository, final AnimalImageRepository s3AnimalImageRepository) {
        return new AnimalRegistrar(postgresAnimalRepository, s3AnimalImageRepository);
    }

}
