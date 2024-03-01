package com.pratik.testwebsites;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		driver.switchTo().alert();
		driver.close();
	}

}
