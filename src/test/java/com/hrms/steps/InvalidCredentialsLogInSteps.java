package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidCredentialsLogInSteps extends CommonMethods{

	

	@When("user enters valid username")
	public void user_enters_valid_username() {
		sendText(login.username, "Admin");
		
	}

	@When("user enters empty password")
	public void user_enters_empty_password() {
		sendText(login.password, "");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		jsClick(login.loginBtn);
		wait(2);
	}

	@Then("user see Password can not be empty error message")
	public void user_see_error_message() {
	   String actualMsg=login.PasswordCanNotBeEmptyMSG.getText();
	   String expectedMsg="Password cannot be empty";
	   Assert.assertTrue(actualMsg.equals(expectedMsg));
	}

	@When("user enters empty username")
	public void user_enters_empty_username() {
		sendText(login.username, "");
	}

	@When("valid password")
	public void valid_password() {
		sendText(login.password, "Hum@nhrm123");
	}

	@Then("user see Username can not be empty error message")
	public void user_see_Username_can_not_be_empty_error_message() {
		String actualMsg=login.usernameCannotBeEmptyMsg.getText();
		   String expectedMsg="Username cannot be empty";
		  // Assert.assertEquals("Message is not matching", expectedMsg, actualMsg);
		   Assert.assertTrue(actualMsg.equals(expectedMsg));
	}

}
