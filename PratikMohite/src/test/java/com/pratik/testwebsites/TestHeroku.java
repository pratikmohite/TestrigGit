package com.pratik.testwebsites;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHeroku {

	public static void main(String[] args) {

		//CheckBox 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();

		//fetching text	
		String c1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
		String c2="Checkboxes";

		//Check user is on checkbox page	
		if(c1.equals(c2))
		{
			System.out.println("User is on Checkboc page");
		}

		else
		{
			System.out.println("User is not on checkbox page");
		}	

		//Verify if checkbox is selected or not
		boolean e=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
		if(e)
		{
			System.out.println("Check Box is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}

		//implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Navigating back
		driver.navigate().back();

	}

}
