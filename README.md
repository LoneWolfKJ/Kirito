# VoteBlocks 

## **Introduction**

The current voting scenario is quite unappealing. Especially for people living away from their own constituency. This problem can be solved using online decentralized voting system which is made reliable, transparent and secure using blockchain.We will be using the Ethereum based implementation. Ethereum uses Proof of Stake consensus and is permissioned blockchain.
 
VoteBlocks is a decentralised platform which does exactly that. The user can enter their details including their voter id and the candidate to whom they prefer to vote ("none" option available). In addition to this the users, using the app in an area where there is little or no internet connectivity, can use the app. After the user votes, when the internet connection is available the user's vote will automatically be counted and saved in the blockchain. The person will be remembered in the blockchain and will be prevented from voting for the second time. Vote counting is **automatic** and **completely transparent** at the same time. At the end of the voting time, the candidate with the largest number of votes will be displayed along with the number of votes the candidate has earned. 

## **Techstack used**

1. **Spring boot**
2. **MongoDB**
3. **web3.js**
4. **Solidity**
5. **Docker**
6. **RabbitMQ**
7. **Azure blockchain**

# **Idea**
The idea is quite simple yet intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id, a secure password(some record which is not available publically), full name, the delegate to whom they want to vote. This data would then be recieved by our api, which would verify that the given data is valid (ie:- exists in the database). 

Incase the user has connectivity problems, the webapp would be having offline support for post requests, the data entered would be encrypted and stored locally and then sent when internet is available in the next 10min else send a message of try again. In this way the data would remain secure even while stored locally. For offline post requests we plan to do it similarly as stated in [this article](https://medium.com/web-on-the-edge/offline-posts-with-progressive-web-apps-fc2dc4ad895) from medium.

The post request would be handled by the controller and If its valid (ie - the voter id exists in the database and relevant details match), a new block is created in the blockchain for the new user and the address of the block for that user is mapped to a structure which holds a bool variable(to check whether user have already voted or not and cannot vote for the 2nd time) and the candidate to whom he is voting.

Also initially blocks for the representatives would be created and their address used as a key for a map which would hold his/her votes obtained. This would help make vote counting automatic and less time consuming.

A functionality to send SMS/Email without increasing perceived user latency using RabbitMQ would be implemented.

For the database we would require details like the person's name, voter id, aadhar no (or whatever the record we would use as password) etc. For now we would populate the database with data as per our requirements.

Finally we will be deploying our blockchain to the Azure Blockchain .

## Workflow
![workflow of the blockchain transaction](https://github.com/LoneWolfKJ/Kirito/tree/master/Workflow/workflow.PNG)

## **How it is Useful**
 1) It enable's voters to vote from anywhere during the voting period.
 2) It makes vote counting an effortless, efficient and secure procedure. The result of any elections could be declared in minutes from when the voting ends
 3) During elections, the need to stand in long lines is eradicated and time is thus saved, even for people from rural area's with sparse connectivity to the net.
 4) After elections the voting system could easily be made transparent and help the voter's know that their vote has been counted correctly and no unfair process has taken place.

## **Team - Kirito**

### **Birla Institute of Tehnology Mesra**

##### [Ayush Shah](https://github.com/shahayush457)
##### [Kanjal Dalal](https://github.com/LoneWolfKJ)
##### [Abhishek Sahai](https://github.com/silentknight16)


