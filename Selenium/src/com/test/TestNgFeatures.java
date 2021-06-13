package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures 
{
	@Test (invocationCount = 10)
	public void loginTest()
	{
		System.out.println("Login");
		int i = 9/1;
	}
	
	@Test(dependsOnMethods = "loginTest" )
	public void homePageTest()
	{
		System.out.println("Home Page Test");
	}

}
