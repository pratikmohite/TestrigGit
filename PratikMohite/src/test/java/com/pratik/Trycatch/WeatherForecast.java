package com.pratik.Trycatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeatherForecast {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
	
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	        int attempt = 0;
	        do {
	            try {
	                driver.get("https://www.weather.com");

	                WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#LocationSearch_input")));

	                searchBox.sendKeys("Pune");
	                searchBox.submit();
	                driver.findElement(By.xpath("//*[@id=\"LocationSearch_listbox-9548c66d09a8d12ab003ec18cfba4e2396a187933f9ae53bc77d1893d3299a50\"]")).click();

	                WebElement locationText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"WxuCurrentConditions-main-b3094163-ef75-4558-8d9a-e35e6b9b1034\"]/div/section/div/div/div[1]")));

	                String text = locationText.getText();

	                if (text.equals("Pune")) {
	                    System.out.println("Pune Weather is Shown");
	                } else {
	                    System.out.println("Weather forecast for Pune is not shown");
	                }
	                break; 
	            } catch (Exception e) {
	                System.out.println("Attempt " + (attempt + 1) + " failed: " + e.getMessage());
	                attempt++;
	            }
	        } while (attempt < 3); 

	        if (attempt == 3) {
	            System.out.println("Weather forecast retrieval failed after 3 attempts.");
	        }

	        driver.quit();

	}

}
