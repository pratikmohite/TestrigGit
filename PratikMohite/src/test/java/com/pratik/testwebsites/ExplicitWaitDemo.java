package com.pratik.testwebsites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
	
//		Get Driver
		WebDriver driver=new ChromeDriver();
		Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//		Open Link
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.cssSelector("#populate-text")).click();
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		
		
		System.out.println("**Explicit Wait***");
		driver.quit();

	}

}
