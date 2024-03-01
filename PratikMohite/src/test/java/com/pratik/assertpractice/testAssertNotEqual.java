package com.pratik.assertpractice;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAssertNotEqual {
	

	@Test
	public void testAssertFunctions() {
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	
	driver.navigate().to("https://www.browserstack.com/");
	js.executeScript("window.scrollBy(0,200)", "");
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | browserStack";
	Assert.assertNotEquals(ExpectedTitle, ActualTitle);
	}

}
