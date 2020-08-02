Feature: Login

  @smoke
  Scenario: Valid admin login
    And user is logged in with valid admin username and password
    And user clicks on login button
    Then admin user is successfullly loged in

  @smoke
  Scenario: valid ess login
    And user is logged in with valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in

  @smoke
  Scenario: Login with valid username and invalid password
    Given User is navigated to the HRMS
    When User enter valid username and invalid password
    And User click on login button
    Then User see Invalid credntials text on login page

@test
  Scenario Outline: 
    When user should enter valid "<Username>" and "<Password>"
    And user clicks on login button
    Then "<FirstName >" is successfully added

    Examples: 
      | Username | Password   | FirstName |
      | Admin    | Hum@n123   | Admin     |
      | Freedy   | Syntax2020! | Freedy    |
