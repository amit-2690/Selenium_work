package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.close();
		
	}

}
