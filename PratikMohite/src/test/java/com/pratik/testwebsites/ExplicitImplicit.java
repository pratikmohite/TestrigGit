package com.pratik.testwebsites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitImplicit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		boolean status=e1.isDisplayed();
		if(status)
		{
			System.out.println("Webdriver is visible");
		}
		else
		{
			System.out.println("Webdriver is not visible");
		}	

		driver.quit();
	}

}
