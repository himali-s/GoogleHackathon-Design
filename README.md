# GoogleHackathon-Design
Database Design and Crud operations on problem of google hackathon
Problem Description
Google is planning to organize a Hackathon. Tournament includes individual and team based application development. Design DB and RESTful CRUD services for organizing the hackathon.
Constraints
•	A individual/team can participate in two coding languages.
•	Each individual/team can have a maximum of three submissions.
•	A team can have at most three members
Sample Use Cases
•	Allow individual registrations 
•	Allow team registrations
•	An Individual can also register to participate as a team member
•	A team can have a maximum of three submissions in at most two programming languages
•	Individual can deregister from a team or the hackathon. 

Approach:
for database, there will be three tables namely Person. Team and submission. Here I have created java classes for all of them. Person will have entities like id, name and dateofbirth. Team will have entities like id, team members id & number of members. The submission class will have entities submission-id, tean-id & programming language. For restful services we will Use Get and Post. 
For example: get /person/5, you should see the details of person with id 5. 
get /team/5 , you shouuld see the details of team with id 4. get /team/5/1 You should get the details of member with id 1 in team4.

I have not attached the services java class. Just created the genral class and DAO class for all the three. We can use get & post using Postman or connceting to server & database. For just example purpose I have created list of persons and teams. 

