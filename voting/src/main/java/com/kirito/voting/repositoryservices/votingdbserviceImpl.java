package com.kirito.voting.repositoryservices;

import com.kirito.voting.models.UserEntity;
import com.kirito.voting.repositories.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;

@Service
public class votingdbserviceImpl implements votingdbservice {

    //@Autowired
    //private Provider<ModelMapper> modelMapperProvider;

    @Autowired
    private UserRepository votingDb;

    @Override
    public String Validate(String voterID, String Password) {
        Optional<UserEntity> myvote = votingDb.findByVoterid(voterID);
        if(myvote.isPresent()){
            UserEntity myvote1 = myvote.get();
            if(myvote1.getAadhar().equals(Password)){
                return "valid";
            }
            else{
                return "incorrect password alert";
            }
        }
        else{
            return "voterId does not exist";
        }
   }
}
