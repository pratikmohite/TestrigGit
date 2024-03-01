package com.pratik.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ModernAlertExample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	        driver.get("https://letcode.in/alert");
	        driver.findElement(By.cssSelector("#modern")).click();
	        WebElement modernAlert = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p"));
	       
	        String alertText = modernAlert.getText();
	        System.out.println("Modern Alert text: " + alertText);
	        WebElement closeButton = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button"));
	        closeButton.click(); // To close the modern alert
	        driver.quit();

}
}
