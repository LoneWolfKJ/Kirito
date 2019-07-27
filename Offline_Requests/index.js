import * as fuck from './app.js';
import * as axios from 'axios';
const voter_id = document.getElementById('vote').value;
const password = document.getElementById('pass').value;
const vote_to = document.getElementById('delegate').value;
const postData = {
    voter_id: "voter_id",
    password: "password",
    vote_to: "vote_to"
  };
  
  let axiosConfig = {
    headers: {
        'Content-Type': 'application/json;charset=UTF-8',
        "Access-Control-Allow-Origin": "*",
    }
  };
  
  axios.post('./voting/v1/vote', postData, axiosConfig)
  .then((res) => {
    console.log("RESPONSE RECEIVED: ", res);
  })
  .catch((err) => {
    console.log("AXIOS ERROR: ", err);
    // const off = new offline();
    // off.send();
    fuck.send();
  });