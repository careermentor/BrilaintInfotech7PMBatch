package org.xyz.automation.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class DataGeneratorClass 
{

	@DataProvider(name="static")
	public Object[][] testdata()
	{
		//Object[] data = {"user1","pass1"};   //1-D array

		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return data;
		
	}
}
