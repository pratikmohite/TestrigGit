package com.pratik.Trycatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		int i = 0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.cssSelector("#display-other-button")).click();
		while(i<50) {
			try {
				boolean a=driver.findElement(By.cssSelector("#hidden")).isDisplayed();
				if(a) {
					System.out.println("Button is displayed");
					driver.quit();
					break;
				}
			} catch (Exception e) {
				i++;
				// TODO: handle exception
			}
		}
	}

	}


