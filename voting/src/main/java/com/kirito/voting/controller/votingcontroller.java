package com.kirito.voting.controller;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c179786... controller
=======
>>>>>>> 61a0f32... Revert "merged"
import com.kirito.voting.dto.getVote;
import com.kirito.voting.dto.voteresponse;
import com.kirito.voting.services.votingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping(votingcontroller.VOTING_API_ENDPOINT)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 61a0f32... Revert "merged"
public class votingcontroller {
    public static final String VOTING_API_ENDPOINT = "/voting/v1";
    public static final String VOTING_API = "/vote";

    @Autowired
    private votingService votingservice;

    /*
    {
	    "voterid" : "9999999993",
	    "aadhar" : "9292929294",
	    "voteto": "Modi"
    }
    */
    @PostMapping(VOTING_API)
    public ResponseEntity<voteresponse> vote(@RequestBody getVote getvote){
        try {
            voteresponse response = votingservice.givevote(getvote);
            return ResponseEntity.ok().body(response);
        } catch (Exception x) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
<<<<<<< HEAD
=======
public class votingcontroller {
>>>>>>> 29229d6... structure
=======
public class votingcontroller {
    public static final String VOTING_API_ENDPOINT = "/voting/v1";
    public static final String VOTING_API = "/vote";

    @Autowired
    private votingService votingservice;

    /*
    {
	    "voterid" : "9999999993",
	    "aadhar" : "9292929294",
	    "voteto": "Modi"
    }
    */
    @PostMapping(VOTING_API)
    public ResponseEntity<voteresponse> vote(@RequestBody getVote getvote){
        try {
            voteresponse response = votingservice.givevote(getvote);
            return ResponseEntity.ok().body(response);
        } catch (Exception x) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
>>>>>>> c179786... controller
=======
>>>>>>> 61a0f32... Revert "merged"
}
