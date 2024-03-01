package com.pratik.WindowHandles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframeExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.selenium.dev/documentation/en/");

	        // Switch to the iframe by locating the iframe element
	        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
	        driver.switchTo().frame(iframeElement);
	        
	        

	        // Perform operations inside the iframe
	        WebElement searchBox = driver.findElement(By.id("search-by"));
	        searchBox.sendKeys("webdriver");

	        // Switch back to the default content
	        driver.switchTo().defaultContent();

	        // Perform operations outside the iframe
	        WebElement heading = driver.findElement(By.tagName("h1"));
	        System.out.println("Heading text outside iframe: " + heading.getText());

	        // Close the browser
	        driver.quit();

	}

}
