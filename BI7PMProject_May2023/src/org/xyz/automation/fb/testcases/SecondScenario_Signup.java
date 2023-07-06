package org.xyz.automation.fb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClasspkg.InitiateBrowser;
import org.xyz.automation.fb.pages.SignupPage;
import org.xyz.automation.fb.utilitiesClass.Readconfigfile;

public class SecondScenario_Signup extends InitiateBrowser
{

	@Test
	public void verifysignupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbtn();
		sign.enter_firstname(Readconfigfile.readconfig("firstname"));
		sign.enter_lastname(Readconfigfile.readconfig("lastname"));
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("6");
		
		sign.click_signupbtn();
	}
	
}
