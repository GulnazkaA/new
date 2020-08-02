@addemployee
Feature: Add  new employee

  Background: 
    Given user is logged in with valid admin credentials
    And user navigates to AddEmployee Page

  Scenario: Add employee with first and last name
    When user enters employee "Sarah" and "Conor"
    And user clicks save button
    Then "Sarah Conor" is added succesfully

  #Scenario: Add Employee withou employee ID
  #Given user is logged in with valid admin credentials
  #And user navigates to AddEmployee Page
  #When user enters employee first and last name and clicks save button
  #And user deletes employee id
  #And user clicks save button
  #Then employee is added succesfully
  #Scenario: Add Employee and cerate login credentials
    #And user enters employee "Yuriy" and "Gagarin"
    #And user clicks on create login chekbox
    #And user enters login credentials"Yurik"
    #And user clicks save login button
    #Then "Yuriy Gagarin" is added succesfully
    #And delete created employee

  @inprogress
  Scenario Outline: Adding multiple employees
    When user enters employee "<FirstName>","<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>","<MiddleName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName |
      | Kate      | J          | Sams     |
      | Maru      | H          | Franky   |
      | Sam       | K          | Brown    |

  #adding multiple employees using cucumber datatable
  
  @test1
  Scenario: Adding multiple employees
    When user enters employee details and click on save
      | FirstName | MiddleName | LastName |
      | Maks      | L          | Maks     |
      | Nick      | M          | Nick     |
      Then employee is added successfully
