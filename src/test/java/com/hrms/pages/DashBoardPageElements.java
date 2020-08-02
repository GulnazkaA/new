package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
public class DashBoardPageElements extends CommonMethods{
	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	@FindBy(xpath="//a[contains(text(),'Employee List')]")
	public WebElement employeeList;
	
	@FindBy(xpath="//div[@class='menu']/ul/li")
	public List<WebElement>dashMenu; 
	
	@FindBy(xpath="//*[@id=\"recordsListDiv\"]/div[1]/h1")
	public List<WebElement>licenseMenu;
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
	public WebElement clickAdmin;
	
	@FindBy(id="menu_admin_Qualifications")
	public WebElement qualif;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement addEmpFirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement addEmpLastName;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement saveEmpBtn;
	
	@FindBy(xpath="//div[@id='profile-pic']")
	public WebElement profilePic;
	
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	public WebElement lastNameVerification;
	
	@FindBy(xpath="//input[@value='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
	public WebElement empIDBox;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement saveChangesBtn;
	
	@FindBy(xpath="//input[@id='chkLogin']")
	public WebElement createLoginChekbox;
	
	@FindBy(xpath="//input[@id='user_name']")
	public WebElement LoginDeatilsFirstName;
	
	@FindBy(xpath="//input[@id='user_password']")
	public WebElement LoginDeatilsPassword;
	
	@FindBy(xpath="//input[@id='re_password']")
	public WebElement ConfirmLoginDeatilsPassword;
	
	@FindBy(xpath="//select[@id='status']")
	public WebElement statusDD;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement statusSaveBTN;
	
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	public WebElement employeeSearchNameBox;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public WebElement empSearchBTN;
	
	@FindBy(xpath="//input[@id='ohrmList_chkSelectAll']")
	public WebElement selectAllEmployees;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	public WebElement deleteEmployee;
	
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")
	public WebElement dialogDeleteBTN;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void selectStatus() {
		statusDD.click();
		if(statusDD.equals("Enabled")) {
			statusSaveBTN.click();
		}
		
	}

	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
	public void navigateToQualifications() {
		jsClick(clickAdmin);
		jsClick(qualif);
	}
	public void navigateToEmployeeList() {
		jsClick(PIM);
		jsClick(employeeList);
	}
}
