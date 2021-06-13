package com.crm.qa.utill;

import com.crm.qa.pages.HomePage;

public class TestUtill extends HomePage
{
	public static long PAGE_LOAD_TIMEOUT= 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

}
