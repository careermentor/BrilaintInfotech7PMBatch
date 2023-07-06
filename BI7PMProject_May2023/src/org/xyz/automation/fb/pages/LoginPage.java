package org.xyz.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.fb.utilitiesClass.Readconfigfile;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		
		driver.findElement(By.id(Readconfigfile.readelement("FB_Login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String password) throws Exception
	{
		
		driver.findElement(By.name(Readconfigfile.readelement("FB_Login_password_name"))).sendKeys(password);
	}
	
	public void click_loginbtn() throws Exception
	{
		
		driver.findElement(By.name(Readconfigfile.readelement("FB_Login_loginbtn_name"))).click();
	}
}
