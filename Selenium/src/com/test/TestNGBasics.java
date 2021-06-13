package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{
	@BeforeSuite
	public void setUp ()
	{
		System.out.println(" Enter System Properties");
	}
	
	@BeforeTest
	public void launchBrowser ()
	{
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass
	public void Login ()
	{
		System.out.println("Enter the Credentials");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
		
	@Test
	public void googleTitleTest ()
	{
		System.out.println("Google Title Test");
	}
	
	@Test
	public void googleSearchTest()
	{
		System.out.println("Google Search Test");
	}
	
	@Test
	public void googleLogoTest ()
	{
		System.out.println("Google Logo Test");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout from Application");
	}
	
	@AfterTest
	public void deleteAllcookies ()
	{
		System.out.println("Delete All Cookies");
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		System.out.println("Close the Browser");
	}
	
	@ AfterSuite
	public void generateReports()
	{
		System.out.println(" Generate the reports");
	}
}
