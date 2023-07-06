package org.xyz.automation.fb.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	
	public static void testresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot prtscr = (TakesScreenshot) driver;  //take screnshot like prtscr
		
		File f = prtscr.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
	}
	
	
}
