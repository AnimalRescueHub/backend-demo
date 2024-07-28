package com.animalshelter.backend.animal.infrastructure.http.input;

import com.animalshelter.backend.animal.application.AnimalRegistrar;
import com.animalshelter.backend.animal.application.CreateAnimalCommand;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class HttpCreateAnimalController {

    private final AnimalRegistrar animalRegistrar;

    public HttpCreateAnimalController(final AnimalRegistrar animalRegistrar) {
        this.animalRegistrar = animalRegistrar;
    }

    @PostMapping("/animal")
    public ResponseEntity<?> postAnimal(@RequestBody final AnimalDto animalDto, @RequestParam("file") MultipartFile image) {
        File animalImage;
        try {
            animalImage = convertMultiPartToFile(image);
        } catch (IOException e) {
            return ResponseEntity.badRequest().body("Image not valid");
        }
        animalRegistrar.execute(new CreateAnimalCommand(animalDto.id(), animalDto.name(), animalDto.animalType(), animalImage));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
