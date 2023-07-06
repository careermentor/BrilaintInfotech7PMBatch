package testNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario1 
{
	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first testcase");
		
		//to compare actual result expected result
		
		//Assert.assertEquals("Hello", "Hello1");  //execution stopped - hard assertion
		
		SoftAssert sa = new SoftAssert();  //soft assertion
		sa.assertEquals("Hello", "Hello1");		//soft assertion
		
		System.out.println("this test case get failed");
		
		sa.assertAll();
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second testcase");
	}
	
	@Test(priority=3)
	public void third_testcase()
	{
		System.out.println("third testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth testcase");
	}

	@Test(priority=-2)
	public void fifth_testcase()
	{
		System.out.println("fifth testcase");
	}
	
	@Test(priority=-1)
	public void sixth_testcase()
	{
		System.out.println("sixth testcase");
	}
	
}
