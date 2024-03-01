package com.pratik.WebdriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfElementLocatedExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
             
	        
	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	       
			System.out.println("Element is Present");

	        element.sendKeys("Selenium WebDriver");
	        driver.quit();

	}

}
