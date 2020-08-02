package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SauceDemoLoginPage;
import com.hrms.pages.ViewEmployeePageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes

public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	public static SauceDemoLoginPage sauce;

	public static void initialize() {

		login = new LoginPageElements();
		dashboard = new DashBoardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		viewEmp = new ViewEmployeePageElements();
		sauce = new SauceDemoLoginPage();
	}
}
