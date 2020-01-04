Feature: Login to Leaftaps application

Scenario: TC01 Positive case for login & logout
Given Launch the browser,
And maximize the browser, 
And Load the URL,
And Enter username as demosalesmanager
And Enter password as crmsfa
When Click on login button
Then Verify login Successful
Then Click on logout button