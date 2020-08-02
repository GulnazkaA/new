package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {

	@Given("user navigates to AddEmployee Page")
	public void user_navigates_to_AddEmployee_Page() {
		dashboard.navigateToAddEmployee();
	}

	@When("user enters employee {string} and {string}")
	public void user_enters_employee_first_and_last_name(String firstName, String lastName) {
		sendText(dashboard.addEmpFirstName, firstName);
		sendText(dashboard.addEmpLastName, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button1() {
		jsClick(dashboard.saveEmpBtn);
	}

	@Then("{string} is added succesfully")
	public void employee_is_added_succesfully(String expectedName) {
		String actual = dashboard.profilePic.getText();
		String expected = expectedName;
		Assert.assertEquals(expected, actual);
	}

	@When("user enters employee {string} and {string} and clicks save button")
	public void user_enters_employee_first_and_last_name_and_clicks_save_button(String firstName, String lastName) {
		sendText(dashboard.addEmpFirstName, firstName);
		sendText(dashboard.addEmpLastName, lastName);
		jsClick(dashboard.saveEmpBtn);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		dashboard.editButton.click();
		wait(2);
		dashboard.empIDBox.clear();
		wait(2);
		dashboard.saveChangesBtn.click();

	}

	@Given("user clicks on create login chekbox")
	public void user_clicks_on_create_login_chekbox() {
		dashboard.createLoginChekbox.click();
	}

	@Given("user enters login credentials{string}")
	public void user_enters_login_credentials(String userName) {
		sendText(dashboard.LoginDeatilsFirstName, userName);
		sendText(dashboard.LoginDeatilsPassword, "Syntax123!");
		sendText(dashboard.ConfirmLoginDeatilsPassword, "Syntax123!");

	}

	@Given("user clicks save login button")
	public void user_clicks_save_button() {
		dashboard.selectStatus();
		jsClick(dashboard.saveEmpBtn);

	}

	@Then("delete created employee")
	public void delete_created_employee() {
		dashboard.navigateToEmployeeList();
		dashboard.employeeSearchNameBox.sendKeys("Morgan Freeman");
		dashboard.empSearchBTN.click();
		wait(3);
		dashboard.selectAllEmployees.click();
		dashboard.deleteEmployee.click();
		dashboard.dialogDeleteBTN.click();

	}

	@When("user enters employee {string},{string} and {string}")
	public void user_enters_employee_and(String fName, String mName, String lName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
	}

	@Then("{string},{string} and {string} is added successfully")
	public void and_is_added_successfully(String string, String string2, String string3) {
		System.out.println("Employee is added");
	}

	@When("user enters employee details and click on save")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
		List<Map<String, String>> addEmployeeList = dataTable.asMaps();
		for (Map<String, String> map : addEmployeeList) {

			String fName = map.get("FirstName");
			String mName = map.get("MiddleName");
			String lName = map.get("LastName");
			sendText(addEmp.firstName, fName);
			sendText(addEmp.middleName, mName);
			sendText(addEmp.lastName, lName);
			click(addEmp.saveBtn);

			// verification
			String actual = pdetails.profilePic.getText();
			String expected = fName + " " + mName + " " + lName;
			Assert.assertEquals("Employee is not added", expected, actual);
			
			jsClick(dashboard.addEmp);
			wait(5);
		}
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		System.out.println("Employee is added");

	}

}
