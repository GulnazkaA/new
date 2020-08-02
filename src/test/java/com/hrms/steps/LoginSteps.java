package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	@Given("User is navigated to the HRMS")
	public void user_is_navigated_to_the_HRMS() {
		setUp();
	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Blalaa");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		jsClick(login.loginBtn);
	}

	@Then("User see Invalid credntials text on login page")
	public void user_see_Invalid_credntials_text_on_login_page() {
		String actualmsg = login.errorMsg.getText();
		String expectedmsg = "Invalid credentials";
		Assert.assertTrue(actualmsg.equals(expectedmsg));
		
	}

	@Given("user is logged in with valid admin username and password")
	public void user_is_logged_in_with_valid_admin_username_and_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		jsClick(login.loginBtn);
	}

	@Then("admin user is successfullly loged in")
	public void admin_user_is_successfullly_loged_in() {
		String actualmsg = login.WelcomeAdmin.getText();
		String expectedmsg = "Welcome Admin";
		Assert.assertTrue(actualmsg.equals(expectedmsg));
		
	}

	@Given("user is logged in with valid ess username and password")
	public void user_is_logged_in_with_valid_ess_username_and_password() {
		sendText(login.username, "Freedy");
		sendText(login.password, "Syntax2020!");
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String actualmsg = login.WelcomeFreedy.getText();
		String expectedmsg = "Welcome Freedy";
		Assert.assertTrue(actualmsg.equals(expectedmsg));
		tearDown();
	}

	@When("user should enter valid {string} and {string}")
	public void user_should_enter_valid_and(String username, String password) {
	   sendText(login.username,username);
	   sendText(login.username,password);
	}

	@Then("{string} is successfully added")
	public void is_successfully_added(String string) {
	   System.out.println("Employee is added");
	}

	
}
