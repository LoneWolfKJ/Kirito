package com.kirito.voting.repositories;

import com.kirito.voting.models.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface VotingRepository extends MongoRepository<UserEntity, String> {
    Optional<UserEntity> findByVotingId(String userId);
}
