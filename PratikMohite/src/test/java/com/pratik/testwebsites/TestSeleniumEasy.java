package com.pratik.testwebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumEasy {

	public static void main(String[] args) {
		//CheckBox 
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
				 
				driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
				boolean b=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).isSelected(); 
                if(b)
                {
                	System.out.println("Radio button is selected");
                	driver.close();
                }
                else
                {
                	System.out.println("Radio button is not selected");
                	driver.close();
                }
	}

}
