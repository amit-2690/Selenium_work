package com.qa.hubspot.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	public WebDriver driver;
	public WebDriverWait wait;

	
// create the constructor
	
	public Page (WebDriver driver,WebDriverWait wait )
	{
		this.driver = driver;
		this.wait = wait;
	}
}
