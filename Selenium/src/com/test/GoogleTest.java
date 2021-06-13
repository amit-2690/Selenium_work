package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void googleTitleTest()
	{
		System.out.println("Page title is" + " "+ driver.getTitle() );
	}
	
	@Test (priority = 2)
	public void googleLogoTest()
	{
		driver.findElement(By.xpath(null));
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
	

}
