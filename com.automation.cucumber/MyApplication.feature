Feature: Test Facebook application

@smoke
Scenario: Test login with valid credentials
Given open browser and start application
When I enter valid username and password
Then User should login succesfully

