import * as fuck from './app.js';
//import axios from 'axios';
// const express = require('express');
// const app = express();

const voter_id = document.getElementById('vote').value;
const password = document.getElementById('pass').value;
const vote_to = document.getElementById('delegate').value;
const postData = {
    voter_id: "voter_id",
    password: "password",
    vote_to: "vote_to"
};
const Url = '/voting/v1/vote';
const port = 5000;
//   let axiosConfig = {
//     headers: {
//         'Content-Type': 'application/json;charset=UTF-8',
//         "Access-Control-Allow-Origin": "*",
//     }
//   };
  
//   axios.post('./voting/v1/vote', postData)
//   .then((res) => {
//     console.log("RESPONSE RECEIVED: ", res);
//   })
//   .catch((err) => {
//     console.log("AXIOS ERROR: ", err);
//     fuck.send();
//   });

$('.btn').click(function(){
    $.post(Url, postData, function(status){
        console.log('status is ${status');
        if(status != 200)
        fuck.send();
    });
});

// app.listen(port, function(){
//     console.log("Server running at port :" +port);
// });