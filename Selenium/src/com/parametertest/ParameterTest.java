package com.parametertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterTest
{
	WebDriver driver;
	@Test
	public void yahooTest()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//*[@id='login-username']"));
		driver.findElement(By.xpath("//*[@id='login-username']"));
		
	}
	
}
