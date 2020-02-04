Feature: Login
@smoke
Scenario: Successful Login
Given User is on the login page
When User enters valid crendentials and click submit button
Then User does successful login