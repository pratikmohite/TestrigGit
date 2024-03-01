package com.pratik.parallelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class geeksforgeeks {
	
	WebDriver driver;
		@Test
		void testMethod1() {
			System.out.println("Class 3 >> Method2 >> "+Thread.currentThread().getId());
		}
		@Test(groups="Smoke")
		void openTwitter() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://www.geeksforgeeks.org/");
			driver.manage().window().maximize();
			System.out.println("Thread ID: "+Thread.currentThread().getId());
			Thread.sleep(3000);
			driver.close();
		}
		@Test
		void testMethod2() {
			System.out.println("Class 3 >> Method3 >> "+Thread.currentThread().getId());
		}
		@Test
		void testMethod3() {
			System.out.println("Class 3 >> Method4 >> "+Thread.currentThread().getId());
		}

}
