package com.kirito.voting.services;

import com.kirito.voting.dto.getVote;
import com.kirito.voting.dto.voteresponse;

public interface votingService {
    public voteresponse givevote(getVote getvote);
}
