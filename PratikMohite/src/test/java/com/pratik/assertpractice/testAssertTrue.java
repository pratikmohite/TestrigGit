package com.pratik.assertpractice;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class testAssertTrue {
               
	public void testAssertFunctions() {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		assertTrue(verifyTitle);
		
	}
}