package com.kirito.voting.repositoryservices;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public interface
votingdbservice {

    @NotNull
    String Validate(String voterID, String Password);

}
