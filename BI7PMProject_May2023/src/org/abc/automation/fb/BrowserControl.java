package org.abc.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{

	@Test
	public void validatebrowsercontrol() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	//	driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close(); //close one browser at a time
		driver.quit(); //close multiple browser
		
	}

}
