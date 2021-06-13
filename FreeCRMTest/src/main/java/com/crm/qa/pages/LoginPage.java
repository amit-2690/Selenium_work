package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	// Page Factory - OR :
//	@FindBy (name = "username")
//	WebElement username;
	
	By username = By.name("username");
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input [@ type = 'submit']")
	WebElement loginBTN;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignUpBTN;
	
	@FindBy(xpath = "//img[@ class= 'img-responsive']")
	WebElement CRMLogo;
	
	
	// Initializing the Page Objects
	public LoginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Features - Actions
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return CRMLogo.isDisplayed();
	}
	
	public HomePage login (String un, String pwd)
	{
		((WebElement) username).sendKeys(un);
		password.sendKeys(pwd);
		loginBTN.click();
		
		return new HomePage();
		
	}
	

}
