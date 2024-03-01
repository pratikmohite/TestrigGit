package com.pratik.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class ConfirmationAlertExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.id("confirm")).click();
        
        Alert confirmationAlert = driver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("Confirmation Alert text: " + alertText);
        //confirmationAlert.dismiss(); // To dismiss the confirmation alert
        confirmationAlert.accept(); // To accept the confirmation alert
        driver.quit();

	}

}
