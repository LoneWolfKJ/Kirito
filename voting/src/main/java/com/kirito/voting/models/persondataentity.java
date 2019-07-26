package com.kirito.voting.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/*
    {
        "_id" : ObjectId("5d39d8af2a386848350ad0c3"),
        "voterid" : "9999999993",
        "aadhar" : "9292929294",
        "fullname" : "kanjal",
        "constituency" : "delhi",
        "emailid" : "kj@gmail.com",
        "phoneno" : "7600590613",
        "dob" : "13/3/1313"
     }
*/
@Data
@Document(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
public class persondataentity {
    @Id
    private String id;

    @NotNull
    String voterid;

    @NotNull
    String aadhar;

    @NotNull
    String fullname;

    @NotNull
    String constituency;

    @NotNull
    String emailid;

    @NotNull
    String phoneno;

    @NotNull
    String dob;

}
