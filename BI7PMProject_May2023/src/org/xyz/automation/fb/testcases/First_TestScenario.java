package org.xyz.automation.fb.testcases;

import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClasspkg.InitiateBrowser;
import org.xyz.automation.fb.pages.LoginPage;

public class First_TestScenario extends InitiateBrowser
{

	@Test
	public void verifyloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass123");
		login.click_loginbtn();
		
	}
	
}
