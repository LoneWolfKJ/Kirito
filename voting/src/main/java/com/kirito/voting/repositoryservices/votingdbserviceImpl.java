package com.kirito.voting.repositoryservices;

import org.modelmapper.ModelMapper;
import javax.inject.Provider;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;

public class votingdbserviceImpl implements votingdbservice {

    @Autowired
    private Provider<ModelMapper> modelMapperProvider;

    @Override
    public @NotNull String Validate(String voterID, String Password) {
        return null;
    }
}
