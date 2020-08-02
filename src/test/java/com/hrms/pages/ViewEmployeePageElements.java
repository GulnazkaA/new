package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements {
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']")
	public WebElement employeesTable;
	
	@FindBy(xpath="//table[@id='resultTable']//tbody/tr/td[3]")
	public WebElement tableFirstName;
	
	public boolean isTableDisplayed() {
		return employeesTable.isDisplayed();
	}
	
	@FindBy(xpath = "//a[contains (text(),'Freedy J')]")
	public WebElement freddyEmp;
	
	@FindBy(xpath="//a[contains (text(),'Krueger')]")
	public WebElement KruegerLName;
	
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
