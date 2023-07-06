package org.xyz.automation.fb.baseClasspkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.xyz.automation.fb.utilitiesClass.Readconfigfile;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(Readconfigfile.readconfig("browser_name").equalsIgnoreCase("Chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver(); 
			
		}
		
		else if(Readconfigfile.readconfig("browser_name").equalsIgnoreCase("edge"))
		{
		
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver= new EdgeDriver(); 
			
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver(); 
		}
		
		driver.get(Readconfigfile.readconfig("application_url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
