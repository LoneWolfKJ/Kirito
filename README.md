# VoteBlocks 

## **Idea**

The current voting scenario is quite unappealing. Especially for people living away from their own constituency. This problem can be solved using online decentralized voting system which is made reliable, transparent and secure using blockchain. Initally, we were planning to use the Hyperledger Fabric, but it's not compatible with the Azure Blockchain Workbench. Hence, we will be using the Ethereum based implementation for the purpose of this hackathon. Ethereum uses Proof of Stake consensus and is permissioned blockchain.
 
VoteBlocks is a decentralised platform which does exactly that. The user can enter their details including their voter id and the candidate to whom they prefer to vote ("none" option available). In addition to this the users, using the app in an area where there is little or no internet connectivity, can use the app. After the user votes, when the internet connection is available the user's vote will automatically be counted and saved in the blockchain. The person will be remembered in the blockchain and will be prevented from voting for the second time. Vote counting is **automatic** and **completely transparent** at the same time. At the end of the voting time, the candidate with the largest number of votes will be displayed along with the number of votes the candidate has earned. 

## **Techstack used**

<<<<<<< HEAD
<<<<<<< HEAD
1. **Spring boot** - For making RESTful API.
2. **web3.js** - To integrate our smart contract with the RESTful API.
=======
1. **Spring boot** - For making restful API which would authenticate the user from the database and send a vote successfull/unseccessfull message.
2. **web3.js** - To integrate our smart contract with the restful API.
>>>>>>> 694fbab... Implementation1.0
3. **Solidity** - For writing smart contracts.
4. **Azure blockchain** - To deploy the blockchain.
5. **RabbitMQ** - To send confirmation message to the users.
=======
1. **Spring boot**
<<<<<<< HEAD
2. **web3.js**
3. **Solidity**
4. **Azure blockchain**
>>>>>>> f206300... Update README.md
=======
2. **MongoDB**
3. **web3.js**
4. **Solidity**
5. **Docker**
6. **RabbitMQ**
7. **Azure blockchain**
>>>>>>> 2abb59d... Update README.md

<<<<<<< HEAD
<<<<<<< HEAD
# **Implementation of the app**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
The implementation is quite intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id,full name, the delegate to whom they want to vote and a submit button. After submitting their responses post requests will be made to our API. If their is no network connectivitty in that area, then a certain time limit of 'x' minutes is fixed. After a regular interval of 'x' minutes the form will try to send a post request to the API. As soon as the API accepts the post request, a new block is created in the blockchain for each of the users and the address of the blocks for the users would be mapped to a structure which would hold a bool variable(to check whether users have already voted or not - if already voted then they cannot vote for the second time) and the delegate to whom they are voting. For the purpose of making 'VoteBlocks' a quick and time-efficient application, a separate map will be made for the delegates, which would count the number of votes earned by each delegate instantaneously. As soon as the voting period ends the function 'Winning_Delegate()' would return and display the winner along with the number of votes earned by the delegate.
>>>>>>> 9c60b2a... Update README.md
=======
The implementation is quite intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id,full name, the delegate to whom they want to vote and a submit button. After submitting their responses the buttons will be disabled so that their choices are saved. Thereafter, post requests will be made to our API. If their is no network connectivitty in that area, then a certain time limit of 'x' minutes is fixed. After a regular interval of 'x' minutes the form would try to send a post request to the API. As soon as the network connectivity is restored and the API accepts the post request, a new block will be created in the blockchain for each of the users and the address of the blocks for the users would be mapped to a structure which would hold a bool variable(to check whether users have already voted or not - if already voted then they cannot vote for the second time) and the delegate to whom they are voting. For the purpose of making 'VoteBlocks' a quick and time-efficient application, a separate map will be made for the delegates, which would count the number of votes earned by each delegate instantaneously. As a confirmation result, we would carry out a property of sending SMS/E-mail to the person who has voted recently. The voters hence, get a proof that they have cast their vote. As soon as the voting period ends the voting process is sealed. A function 'Winning_Delegate()' would then return and display the winning delegate along with the number of votes earned by the delegate.
<<<<<<< HEAD
>>>>>>> a8c9c25... Update README.md
=======

# **Group Name - Kirito**
<<<<<<< HEAD
# *Team Members :- *
<<<<<<< HEAD
1.) Ayush Shah
2.) Kanjal Dalal
3.) Abhishek Sahai
>>>>>>> c581632... Update README.md
=======
=======
# Team Members :- 
>>>>>>> 20effa5... Update README.md
##### 1.) Ayush Shah
##### 2.) Kanjal Dalal
##### 3.) Abhishek Sahai
>>>>>>> 13413c5... Update README.md
=======

Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, full name, the candidate to whom they want to vote.Then a post request will be made to our API, and if there is no network connection or little network connection then a time limit is set after which the form will try to make a post request to the API. When the API accepts the request a new block is created in the blockchain for the new user and the address of the block for that user is mapped to a structure which holds a bool variable(to check whether user have already voted or not and cannot vote for the 2nd time) and the candidate to whom he is voting. Now to make vote counting automatic and less time consuming we will maintain a seperate map for the candidates which will keep track of the number of votes earned by the candidate till now.  A functionality to send SMS/Email on sucessful vote without increasing perceived user latency using RabbitMQ would also be implemented. As soon as the voting period ends the function Winning_Candidate returns and displays the winning candidate along with the number of votes earned.
<<<<<<< HEAD
>>>>>>> 2f81e61... Implementation added
=======
=======
## **Implementation of the app**

Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, full name, the candidate to whom they want to vote.Then a post request will be made to our API, and if there is no network connection or little network connection then a time limit of 'x' minutes is set, after every x minutes the form will try to make a post request to the API. When the API accepts the request, a new block is created in the blockchain for the new user and the address of the block for that user is mapped to a structure which holds a bool variable(to check whether user have already voted or not and cannot vote for the 2nd time) and the candidate to whom he is voting. Now to make vote counting automatic and less time consuming we will maintain a seperate map for the candidates which will keep track of the number of votes earned by the candidate till now.  A functionality to send SMS/Email on sucessful vote without increasing perceived user latency using RabbitMQ would also be implemented. As soon as the voting period ends the function Winning_Candidate returns and displays the winning candidate along with the number of votes earned.
>>>>>>> 06dd94c... updated

## **Team - Kirito**

### **Birla Institute of Tehnology Mesra**

<<<<<<< HEAD
<<<<<<< HEAD
####Ayush Shah
####Kanjal Dalal
####Abhishek Sahai
>>>>>>> c630d6b... Team added
=======
#### Ayush Shah
#### Kanjal Dalal
#### Abhishek Sahai
>>>>>>> 3844cea... updated team
=======
##### Ayush Shah
##### Kanjal Dalal
##### Abhishek Sahai
>>>>>>> 06dd94c... updated
=======
The implementation is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id,full name, the delegate to whom they want to vote and a submit button. This data would then be recieved by our api, which would verify that the given data is valid  
>>>>>>> 694fbab... Implementation1.0
=======
The implementation is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password, full name, the delegate to whom they want to vote and a submit button. This data would then be recieved by our api, which would verify that the given data is valid (ie exists in the database). The post request would be handled by the controller and If its valid, a block would be created for that user containing his/her vote and a single coin would be sent to be added in the account of the delegate. The delegate's accounts along with a separate dummy account for none would be created before the voting starts.
>>>>>>> f206300... Update README.md
=======
The implementation is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password, full name, the delegate to whom they want to vote. This data would then be recieved by our api, which would verify that the given data is valid (ie:- exists in the database). The post request would be handled by the controller and If its valid, a block would be created for that user containing his/her vote and a single coin would be sent to be added in the account of the delegate. The delegate's accounts along with a separate dummy account for none would be created before the voting starts. In this way the exact number of votes assigned to each delegate can be known easily.A functionality to send SMS/Email on sucessful vote without increasing perceived user latency using RabbitMQ would also be implemented
=======
The implementation is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password, full name, the delegate to whom they want to vote. This data would then be recieved by our api, which would verify that the given data is valid (ie:- exists in the database). 
=======
# **Idea**
<<<<<<< HEAD
The idea is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password, full name, the delegate to whom they want to vote. This data would then be recieved by our api, which would verify that the given data is valid (ie:- exists in the database). 
>>>>>>> e203ec5... Update README.md
=======
The idea is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password(some record which is not available publically), full name, the delegate to whom they want to vote. This data would then be recieved by our api, which would verify that the given data is valid (ie:- exists in the database). 
>>>>>>> 91943c9... Update README.md

Incase the user has connectivity problems, the webapp would be having offline support for post requests, the data entered would be encrypted and stored locally and then sent when internet is available in the next 10min else send a message of try again. In this way the data would remain secure even while stored locally. For offline post requests we plan to do it similarly as stated in [this article](https://medium.com/web-on-the-edge/offline-posts-with-progressive-web-apps-fc2dc4ad895) from medium.

The post request would be handled by the controller and If its valid (ie - the voter id exists in the database and relevant details match), a new block is created in the blockchain for the new user and the address of the block for that user is mapped to a structure which holds a bool variable(to check whether user have already voted or not and cannot vote for the 2nd time) and the candidate to whom he is voting.

Also initially blocks for the representatives would be created and their address used as a key for a map which would hold his/her votes obtained. This would help make vote counting automatic and less time consuming.

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
A functionality to send SMS/Email on sucessful vote without increasing perceived user latency using RabbitMQ would also be implemented
>>>>>>> bf482e4... Update README.md

<<<<<<< HEAD
links reffered - 
https://dzone.com/articles/introduction-to-blockchain-with-java-using-ethereu-1

https://dzone.com/articles/spring-boot-and-web3j-easy-microservices-for-the-e

https://piotrminkowski.wordpress.com/2018/06/22/introduction-to-blockchain-with-java-using-ethereum-web3j-and-spring-boot/ 

<<<<<<< HEAD
https://shazsterblog.blogspot.com/2017/10/java-spring-boot-implementation-of.html
<<<<<<< HEAD
>>>>>>> 2abb59d... Update README.md
=======
=======
A functionality to send SMS/Email on sucessful vote without increasing perceived user latency using RabbitMQ would be implemented
>>>>>>> e86ad45... Update README.md
=======
A functionality to send SMS/Email without increasing perceived user latency using RabbitMQ would be implemented
>>>>>>> 00e4d04... Update README.md
=======
A functionality to send SMS/Email without increasing perceived user latency using RabbitMQ would be implemented.

For the database we would require details like the person's name, voter id, aadhar no (or whatever the record we would use as password) etc. For now we would populate the database with data as per our requirements.
>>>>>>> 165ceb6... Update README.md

<<<<<<< HEAD
=======
>>>>>>> f888143... Update README.md
=======
>>>>>>> 6e5c9d5... Update README.md
=======
## **How it is Useful**
 1) It enable's voters to vote from anywhere during the voting period.
 2) It makes vote counting an effortless, efficient and secure procedure. The result of any elections could be declared in minutes from when the voting ends
 3) During elections, the need to stand in long lines is eradicated and time is thus saved, even for people from rural area's with sparse connectivity to the net.
 4) After elections the voting system could easily be made transparent and help the voter's know that their vote has been counted correctly and no unfair process has taken place.

>>>>>>> f1cdd8a... use case
## **Team - Kirito**

### **Birla Institute of Tehnology Mesra**

<<<<<<< HEAD
##### Ayush Shah
##### Kanjal Dalal
##### Abhishek Sahai
>>>>>>> bf482e4... Update README.md
=======
##### [Ayush Shah](https://github.com/shahayush457)
##### [Kanjal Dalal](https://github.com/LoneWolfKJ)
##### [Abhishek Sahai](https://github.com/silentknight16)
>>>>>>> 271ef38... added github links
