package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.Contacts;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utill.TestUtill;

public class ContactsPageTest extends BaseClass {
	
	LoginPage login;
	HomePage homepage;
	TestUtill testutill;
	Contacts contactspage;
	
	public ContactsPageTest ()
	{
		super ();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initiliazation();
		login = new LoginPage();
		testutill = new TestUtill();
		contactspage = new Contacts();
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		testutill.switchToFrame();
		contactspage = homepage.clickOnContactsLink();
		
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabel(){
		Assert.assertTrue(contactspage.verifyContactsLabel(), "contacts label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectSingleContactsTest(){
		contactspage.selectContactsByName("A1 B1");
	}
	
	@Test(priority=3)
	public void selectMultipleContactsTest(){
		contactspage.selectContactsByName("A1 B1");
		contactspage.selectContactsByName("A3 B3");
		contactspage.selectContactsByName("A1 B1");

	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
