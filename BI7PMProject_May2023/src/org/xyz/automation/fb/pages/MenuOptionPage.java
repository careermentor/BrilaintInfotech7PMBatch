package org.xyz.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.fb.utilitiesClass.Readconfigfile;

public class MenuOptionPage 
{
	WebDriver driver;

	public MenuOptionPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_ourAPproach() throws Exception
	{
		
		driver.findElement(By.id(Readconfigfile.readelement("FB_Login_username_id"))).click();
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
