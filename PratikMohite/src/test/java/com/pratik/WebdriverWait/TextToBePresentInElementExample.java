package com.pratik.WebdriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TextToBePresentInElementExample {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");

	WebElement element = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[4]"));

	Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	boolean isTextPresent = wait.until(ExpectedConditions.textToBePresentInElement(element, "मराठी"));

	System.out.println("Is text present? " + isTextPresent);
	driver.quit();

}
}

