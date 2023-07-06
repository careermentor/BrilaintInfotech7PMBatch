package org.abc.automation.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentControl 
{

	@Test
	public void verifyalldiffcontrol() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.name("fld_username"));
		
		abc.sendKeys("selenium");
		
		
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("java");
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("India");
		con.selectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Gujarat"));
		
		st.selectByVisibleText("Telangana");
		
		
		
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //false
		
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //true
		
	}

}
