Feature: Login



 Background:
    Given user is on the login page

  Scenario: Successful login - positive case
     When Given user is on the login pagen  user enters correct credentials
   Then  user can do the successful login


 Scenario: Testing with multiple test data using data table - positive case
     When user enters below credentails and clicks sing in
      |username |password |
      |invalidUN|invalidPW|
      |validUN  |validPW  |
      |selenium |selenium |
	Then the expected behavior could be