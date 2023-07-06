package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario3 
{
	@Test
	public void first_testcase()
	{
		System.out.println("first testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third testcase");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("forth testcase");
	}

	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth testcase");
	}
	
}
