package com.pratik.WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");


	        String firstWindowHandle = driver.getWindowHandle();

	     
	        WebElement newWindowLink = driver.findElement(By.linkText("About"));
	        newWindowLink.click();

	        Set<String> allWindowHandles = driver.getWindowHandles();

	       
	        String secondWindowHandle = "";
	        for (String handle : allWindowHandles) {
	            if (!handle.equals(firstWindowHandle)) {
	                secondWindowHandle = handle;
	                driver.switchTo().window(handle);
	                break;
	            }
	        }

	       
	        WebElement newWindowOnSecondWindowLink = driver.findElement(By.linkText("Privacy"));
	        newWindowOnSecondWindowLink.click();

	   
	        allWindowHandles = driver.getWindowHandles();

	        String thirdWindowHandle = "";
	        for (String handle : allWindowHandles) {
	            if (!handle.equals(firstWindowHandle) && !handle.equals(secondWindowHandle)) {
	                thirdWindowHandle = handle;
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        
	        Wait<WebDriver> wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement termsLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Your Google Account")));
	   
	        termsLink.click();

	        //driver.quit();
	}

}
