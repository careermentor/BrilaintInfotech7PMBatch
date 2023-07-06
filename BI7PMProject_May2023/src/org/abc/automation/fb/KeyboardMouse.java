package org.abc.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardMouse 
{

	@Test
	public void mouseoperation() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //left click
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //double click
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).keyUp(Keys.CONTROL).perform();
	}
	
	@Test(enabled=false)
	public void keyboardoperation() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	//	driver.get("https://www.google.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("modisantosh@gmail.com").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//act.sendKeys("modisantosh@gmail.com").perform();
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("password123").perform();
		//act.sendKeys(Keys.ENTER).perform();
	}

}
