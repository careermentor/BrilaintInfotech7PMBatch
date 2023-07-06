package org.abc.automation.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstAutomation 
{

	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();  //launch chrome browser
		///driver.get("https://www.facebook.com/");
		driver.get("https://www.universalorlando.com/web/en/us");
		//Thread.sleep(120000);
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
	@Test(enabled=false)
	public void verifyloginfunct()
	{
		
		//Step1
		
		String ExpectedURL = "https://www.facebook.com/";
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualURL, ExpectedURL); 
		
		//Step2
		
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		
		System.out.println(ActualTitle);
		
		sa.assertEquals(ActualTitle, ExpectedTitle);
		
		//Step3
		
		String ExpectedUsernam = "Email address or phone number";
		String ActulaUsername = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		System.out.println(ActulaUsername);
		
		sa.assertEquals(ActulaUsername, ExpectedUsernam);
		
		//step4
		
		String ExpectedLoginbutton = "Log in";
		String ActualLoginbtn = driver.findElement(By.name("login")).getText();
		
		System.out.println(ActualLoginbtn);
		sa.assertEquals(ActualLoginbtn, ExpectedLoginbutton);
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		sa.assertAll();
		
	}
	
	
	@Test(enabled=false)
	public void verifysignup_functionality() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Java");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		
		
	}
	
	
	@Test(enabled=true)
	public void second_testcase() throws Exception
	{
		
	//	Point actualloc = driver.findElement(By.cssSelector("[aria-label='Menu']")).getLocation();
	//	System.out.println(actualloc);
		//Thread.sleep(5000);  //5 secs waiting
		
		///System.out.println(driver.getPageSource());
		
		driver.findElement(By.cssSelector("[aria-label='Menu']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("Username")).sendKeys("smodi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass12345");
		driver.findElement(By.name("button")).click();
		
		String ExpectedError = "Your entry does not match our records. Please try again.";
		
		String ActualError = driver.findElement(By.xpath("//li[text()='Your entry does not match our records. Please try again.']")).getText();
		
		Assert.assertEquals(ActualError, ExpectedError);
		
	}

}
