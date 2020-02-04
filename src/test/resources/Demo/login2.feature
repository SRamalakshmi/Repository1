Feature: Login2


Background:
Given enduser is on the login page

Scenario: Successful login
When enduser enters the valid credentials and click on submit button
Then user does successfull login

Scenario: Invalid login
When enduser enters the invalid credentials and click on submit button
Then user gets error page