package com.kirito.voting.repositories;

import com.kirito.voting.models.persondataentity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface votingdb extends MongoRepository<persondataentity, String> {
    Optional<persondataentity> findByUserId(String userId);
}
