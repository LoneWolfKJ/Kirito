// import * as fuck from 'app.js';
//import axios from 'axios';
//var fuck = require('app.js');
const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors());

// var voter_id = ;
// var password = ;
// var vote_to = ;
const postData = {
    voter_id: "document.getElementById('vote').value",
    password: "document.getElementById('pass').value",
    vote_to: "document.getElementById('delegate').value"
};
const Url = 'http://localhost:8080/voting/v1/vote';

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

function send(){
    event.respondWith(
                                            // Try to get the response from the network
        fetch(event.request.clone()).catch(function() {	
        self.clients.match(thisClient).then(function(client) {
                client.postMessage({
                message: "Post unsuccessful.",
             alert: alert                     // A string we instantiated earlier
                });
        });                             	// Respond with the page that the request originated from
        return caches.match(event.request.clone().referrer);
        })
    );
    
    
    navigator.serviceWorker.addEventListener('message', function(event) {
        alert(event.data.alert);
        store();
    });
    
    function store() {
        var newPost = "";                                    // Inputted values     
        $("input").each(function() {                         // Iterate through the inputs
            newPost += $(this).val() + ",";
        });                                                  // Get rid of the last comma
        newPost = newPost.substr(0, newPost.length - 1);     // Store the data
        localStorage.setItem('newPost', newPost);
    }

    
    // Call the function whenever the page is refreshed
    $(function () {
        if (localStorage.getItem('newPost')) {	                        // Set keys and values for voting for your favorite article
            var names = ['voterid', 'password', 'c1'];
            var values = localStorage.getItem('newPost').split(',');	
        var form = $("#offlinePostForm"); 	                            // Form to append inputs to
        for (var i = 0; i < names.length; i++) {                        // Create and append inputs
            var input = '<input type="hidden" name="' 
            + names[i] + '" value="' 
            + values[i] + '">';
            $(input).appendTo(form);
        }	                                   // Clear newPost from localStorage and submit the form
        localStorage.removeItem('newPost');
        form.submit();
        }
    });
    };

$('.btn').click(function(){
    $.post(Url, postData, function(status){
        console.log('status is ${status');
        if(status != 200)
        send();
    });
});
