package org.xyz.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.fb.utilitiesClass.Readconfigfile;

public class SignupPage 
{
	WebDriver driver;

	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_createnewaccountbtn() throws Exception
	{
		
		driver.findElement(By.xpath(Readconfigfile.readelement("signup_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		
		driver.findElement(By.name(Readconfigfile.readelement("Signup_FirstName_Name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		
		driver.findElement(By.name(Readconfigfile.readelement("Signup_lastName_Name"))).sendKeys(lname);
	}
	
	public void click_signupbtn() throws Exception
	{
		
		driver.findElement(By.name(Readconfigfile.readelement("Signup_SignupButton_name"))).click();
	}
}
