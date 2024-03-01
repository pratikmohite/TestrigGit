package com.pratik.testngdemo;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGDemo {
	WebDriver driver;
     
	@BeforeMethod
	public void openbrowser() {
		  driver=new ChromeDriver();
	}
	
	@Test
	public void openlink()
	{
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	}


