package com.pratik.parallelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tutorialspoint {
	
	WebDriver driver;
		@Test(groups="Smoke")
		void openFacebook() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/index.htm");
			driver.manage().window().maximize();
			System.out.println("Thread ID: "+Thread.currentThread().getId());
			Thread.sleep(3000);
			driver.close();
		}
		@Test
		void testMethod1() {
			System.out.println("Class 1 >> Method2 >> "+Thread.currentThread().getId());
		}
		@Test
		void testMethod2() {
			System.out.println("Class 3 >> Method3 >> "+Thread.currentThread().getId());
		}

}
