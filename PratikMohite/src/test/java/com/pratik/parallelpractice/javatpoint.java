package com.pratik.parallelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javatpoint {
	
	WebDriver driver;
	@Test(groups="Smoke")
	void openInstagram() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		System.out.println("Thread ID: "+Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	void testMethod1() {
		System.out.println("Class 2 >> Method2 >> "+Thread.currentThread().getId());
	}

}
