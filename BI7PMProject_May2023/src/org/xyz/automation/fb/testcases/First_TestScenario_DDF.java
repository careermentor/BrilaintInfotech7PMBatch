package org.xyz.automation.fb.testcases;


import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClasspkg.InitiateBrowser;
import org.xyz.automation.fb.datagenerators.DataGeneratorClass;
import org.xyz.automation.fb.pages.LoginPage;

public class First_TestScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="static",dataProviderClass=DataGeneratorClass.class)
	public void verifyloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbtn();
		
	}
	
	

	
}
