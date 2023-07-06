package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario2 
{
	@Test
	public void first_testcase()
	{
		System.out.println("first testcase");
	}
	
	@Test(groups="Sanity")
	public void second_testcase()
	{
		System.out.println("second testcase");
	}
	
	@Test(enabled=false)
	public void third_testcase()
	{
		System.out.println("third testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth testcase");
	}

	@Test(groups="Smoke")
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
