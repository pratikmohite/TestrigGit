package com.pratik.Trycatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearchNeg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        int maxAttempts = 3;
        int attempt = 0;
        while (attempt < maxAttempts) {
            try {
                driver.get("https://www.amazon.com");
                WebElement searchBox = driver.findElement(By.cssSelector("incorrect_id"));
                searchBox.sendKeys("laptop");
                searchBox.submit();
                System.out.println("Search is successful");
                break; 
            } catch (Exception e) {
                System.out.println("Attempt " + (attempt + 1) + " failed: " + e.getMessage());
                attempt++;
            }
        }
        if (attempt == maxAttempts) {
            System.out.println("Search failed after " + maxAttempts + " attempts.");
        }
        driver.quit();


	}

}
