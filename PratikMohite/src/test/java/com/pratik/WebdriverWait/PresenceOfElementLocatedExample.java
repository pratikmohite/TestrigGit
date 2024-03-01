package com.pratik.WebdriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PresenceOfElementLocatedExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
            
	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

	        element.sendKeys("Selenium WebDriver");
	        System.out.println("Element is present");
	        driver.quit();
	}

}
