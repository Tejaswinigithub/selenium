Feature: Login Functionality

Background: 
Given  If user is on home page
 When   Click on Login link

Scenario Outline:: Verify user is able to login with valid credentials
     
And   Enter user name as "<UserName>" and password as "<Password>"
Then  Verify logout link

Examples:
    | UserName | Password |
    | demo     | 1234     |
    | demo2    | 1234     |
    
   
   Scenario: Verify user is able to navigate payment to user page

And   Enter user name as "demo" and password as "1234"
And   Click on Pay user link
Then  Verify payment to user page

@DB
Scenario: Verify data base values

And   Enter user name as "demo" and password as "1234"




 