package com.animalshelter.backend.animal.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JPARepository extends CrudRepository<AnimalEntity, UUID> {
}
