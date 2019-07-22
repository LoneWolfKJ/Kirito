## VoteBlocks 

# **Introduction**

The current voting scenario is quite unappealing. Especially for people living away from their own constituency. This problem can be solved using online decentralized voting system which is made reliable, transparent and secure using blockchain.
 
VoteBlocks is a decentralised platform which does exactly that. The user can enter their details including their voter id and the delegate to whom they prefer to vote ("none" option available). In addition to this the users, using the app in an area where there
is little or no internet connectivity, can use the app. After the user votes, when the internet connection is available the user's vote will automatically be counted and saved in the blockchain. The person will be remembered in the blockchain and will be prevented from voting for the second time. Vote counting is **automatic** and **completely transparent** at the same time. At the end of the voting time, the delegate with the largest number of votes will be displayed along with the number of votes the delegate has earned. 

# **Techstack used**

1. **Spring boot** - For making restful API.
2. **web3.js** - To integrate our smart contract with the restful API.
3. **Solidity** - For writing smart contracts.
4. **Azure blockchain** - To deploy the blockchain.
5. **RabbitMQ** - To send confirmation message to the users.

# **Implementation of the app**
The implementation is quite intriguing. Starting with the frontend, the users will be provided a form wherein they will be required to fill their voter id,full name, the delegate to whom they want to vote and a submit button. After submitting their responses the buttons will be disabled so that their choices are saved. Thereafter, post requests will be made to our API. If their is no network connectivitty in that area, then a certain time limit of 'x' minutes is fixed. After a regular interval of 'x' minutes the form would try to send a post request to the API. As soon as the network connectivity is restored and the API accepts the post request, a new block will be created in the blockchain for each of the users and the address of the blocks for the users would be mapped to a structure which would hold a bool variable(to check whether users have already voted or not - if already voted then they cannot vote for the second time) and the delegate to whom they are voting. For the purpose of making 'VoteBlocks' a quick and time-efficient application, a separate map will be made for the delegates, which would count the number of votes earned by each delegate instantaneously. As a confirmation result, we would carry out a property of sending SMS/E-mail to the person who has voted recently. The voters hence, get a proof that they have cast their vote. As soon as the voting period ends the voting process is sealed. A function 'Winning_Delegate()' would then return and display the winning delegate along with the number of votes earned by the delegate.

# **Group Name - Kirito**
# Team Members :- 
##### 1.) Ayush Shah
##### 2.) Kanjal Dalal
##### 3.) Abhishek Sahai
