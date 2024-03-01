
package com.pratik.WebdriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertIsPresentExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");

	        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	  
             
	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	        alert.accept();
	        driver.quit();

	}

}
