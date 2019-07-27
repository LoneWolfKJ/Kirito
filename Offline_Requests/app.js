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
    var newPost = ""; // Inputted values    // Iterate through the inputs
    $("input").each(function() {
        newPost += $(this).val() + ",";
    });    // Get rid of the last comma
    newPost = newPost.substr(0, newPost.length - 1);    // Store the data
    localStorage.setItem('newPost', newPost);
}


// Call the function whenever the page is refreshed
$(function () {
    if (localStorage.getItem('newPost')) {	// Set keys and values for voting for your favorite article	var names = ['first', 'last', 'article'];
        var values = localStorage.getItem('newPost').split(',');	// Form to append inputs to
	var form = $("#offlinePostForm"); 	                            // Create and append inputs
	for (var i = 0; i < names.length; i++) {
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