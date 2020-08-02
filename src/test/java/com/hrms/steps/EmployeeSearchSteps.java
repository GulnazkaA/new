package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
		setUp();
	}

	@Given("user is logged in with valid admin credentials")
	public void user_is_logged_in_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
		wait(3);
	}

	@When("user enters valid employee ID")
	public void user_enters_valid_employee_ID() {
		sendText(viewEmp.empID, "001100");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		jsClick(viewEmp.searchBtn);
	}

	@Then("user see employee information is dispalyed")
	public void user_see_employee_information_is_dispalyed() {
		String actualName=viewEmp.freddyEmp.getText();
		String expectedName="Freedy J";
		Assert.assertTrue(actualName.equals(expectedName));
		
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
		sendText(viewEmp.empName,"Freedy J Krueger");
		//click(viewEmp.empName);
	}
	@Then("user see employee name is dispalyed")
	public void user_see_employee_name_is_dispalyed() {
		String actualLastName=viewEmp.KruegerLName.getText();
		String expectedLastName="Krueger";
		Assert.assertTrue(actualLastName.equals(expectedLastName));
		tearDown();
	}

}
