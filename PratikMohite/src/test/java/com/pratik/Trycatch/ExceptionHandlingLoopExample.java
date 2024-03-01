package com.pratik.Trycatch;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class ExceptionHandlingLoopExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        boolean conditionSatisfied = false;

	        Instant startTime = Instant.now();

	        Duration maxDuration = Duration.ofSeconds(30);

	        while (!conditionSatisfied && Duration.between(startTime, Instant.now()).compareTo(maxDuration) < 0) {
	            try {
	   
	                driver.get("https://www.google.com");

	                WebElement element = driver.findElement(By.name("Pratik"));

	                conditionSatisfied = true;

	            } catch (Exception e) {
	                System.err.println("Exception occurred: " + e.getMessage());
	            }
	        }

	        if (conditionSatisfied) {
	            System.out.println("Condition satisfied!");
	        } else {
	            System.out.println("Time limit exceeded. Condition not satisfied.");
	        }

	        driver.quit();
	}

}
