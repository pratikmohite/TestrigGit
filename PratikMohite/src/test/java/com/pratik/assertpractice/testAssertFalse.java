package com.pratik.assertpractice;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAssertFalse {
	
	@Test
	public void testAssertFunctions() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
		assertFalse(verifyTitle);
		
	}
//equalingnorecase is used to ignore upper and lower case for comparing two strings i.e gettitle and "" given string
}
