package com.kirito.voting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getVote {

    public String getVoterid() {
        return voterid;
    }

    public void setVoterid(String voterid) {
        this.voterid = voterid;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getVoteto() {
        return voteto;
    }

    public void setVoteto(String voteto) {
        this.voteto = voteto;
    }

    String voterid;

    String aadhar;

    String voteto;

}
