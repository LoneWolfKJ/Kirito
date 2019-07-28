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
public class UserEntity {
    @Id
    private String id;

    @NotNull
    String voterid;

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    @NotNull
    String aadhar;

    public String getVoterid() {
        return voterid;
    }

    public void setVoterid(String voterid) {
        this.voterid = voterid;
    }

    @NotNull
    String fullname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @NotNull
    String constituency;

    @NotNull
    String emailid;

    @NotNull
    String phoneno;

    @NotNull
    String dob;

}
