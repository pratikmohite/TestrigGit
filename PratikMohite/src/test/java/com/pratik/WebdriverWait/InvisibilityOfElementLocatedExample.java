
package com.pratik.WebdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisibilityOfElementLocatedExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");

	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        boolean isElementInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fakeId")));

	        System.out.println("Is element invisible? " + isElementInvisible);
	        driver.quit();

	}

}
