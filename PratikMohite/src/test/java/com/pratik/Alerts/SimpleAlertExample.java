package com.pratik.Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlertExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Simple Alert text: " + alertText);
		simpleAlert.accept();
		driver.quit();

	}

}
