package com.kirito.voting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class voteresponse {
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    String output;
}
