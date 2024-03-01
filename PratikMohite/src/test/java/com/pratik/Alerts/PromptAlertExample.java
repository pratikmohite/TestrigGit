package com.pratik.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Pratik Mohite");
		promptAlert.accept();
		String message=driver.findElement(By.xpath("//*[@id=\"myName\"]")).getText();
		System.out.println(message);
		driver.quit();
	}

}
