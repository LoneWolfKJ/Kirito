package com.kirito.voting.repositories;

import com.kirito.voting.models.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserEntity, String> {
   Optional<UserEntity> findByVoterid(String userId);
}
