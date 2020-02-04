Feature: Login3

@sanity
Scenario Outline: Successful login
Given Enduser is on the login page
When Enduser enters "<username>" and "<password>" and click on submit button
Then User does successfull login

Examples:
|username  |  password    |
|Lalitha   |  Password123 |
|lalitha1  |  password123 |