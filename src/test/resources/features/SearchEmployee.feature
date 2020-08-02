@Smoke
Feature: Employee Search

Scenario: Search employee by ID

And user is logged in with valid admin credentials
And user navigates to employee list page
When user enters valid employee ID
And clicks on search button
Then user see employee information is dispalyed

Scenario: Search employee by name
 
And user is logged in with valid admin credentials
And user navigates to employee list page
When user enters valid employee name and last name
And clicks on search button
Then user see employee name is dispalyed 
