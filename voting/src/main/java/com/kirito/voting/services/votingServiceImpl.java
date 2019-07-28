package com.kirito.voting.services;

import com.kirito.voting.dto.getVote;
import com.kirito.voting.dto.voteresponse;
import com.kirito.voting.repositoryservices.votingdbservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class votingServiceImpl implements votingService{

    @Autowired
    votingdbservice Votingdbservice;
    @Override
    public voteresponse givevote(getVote getvote) {
        voteresponse Voterresult = new voteresponse();
        Voterresult.setOutput(Votingdbservice.Validate(getvote.getVoterid(),getvote.getAadhar()));
        return Voterresult;
    }
}
