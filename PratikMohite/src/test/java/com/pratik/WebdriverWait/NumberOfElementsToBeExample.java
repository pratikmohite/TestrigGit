package com.pratik.WebdriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NumberOfElementsToBeExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
         try {
	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        List<WebElement> elements =wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 10));

	        System.out.println("Number of elements: " + elements.size());
	        driver.quit();
         }
         catch(TimeoutException e){
        	 System.out.println("Time Out");
        	 driver.quit();
         }
	}

}
