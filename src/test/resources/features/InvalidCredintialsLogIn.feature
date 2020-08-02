@Smoke
Feature: Login with invalid credentials


Scenario: Login with valid username and without password

When user enters valid username
And user enters empty password
And clicks on login button
Then user see Password can not be empty error message


Scenario: Login without username and valid password

When user enters empty username
And valid password
And clicks on login button
Then user see Username can not be empty error message

