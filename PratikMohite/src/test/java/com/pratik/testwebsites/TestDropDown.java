package com.pratik.testwebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		Select selectObject=new Select(dropdown);
		
		selectObject.selectByVisibleText("Option 1");
		
		driver.close();
	}

}
