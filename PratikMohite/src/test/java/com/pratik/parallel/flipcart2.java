package com.pratik.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class flipcart2 {
	
	@Test(groups = {"Smoke","Regression"})
	void buyABook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");

		HomePage hp=new HomePage(driver);
		hp.clickAddBasketBtn();
		
		System.out.println(Thread.currentThread().getId());
		driver.close();
	}
	 
	@Test(groups = "Regression")
	void LikeaProduct() {
	}
	
	@Test(groups = "Regression")
	void clickOnHelp() {
	}
	
	@Test(groups = {"Smoke","Regression"})
	void Login() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://practice.automationtesting.in/");
		
		System.out.println(Thread.currentThread().getId());
		driver.close();
	}

}
