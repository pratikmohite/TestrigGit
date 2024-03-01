package com.pratik.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class flipkart {
		
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
	
	@Test(groups = {"Smoke","Regression"},dataProvider = "userdetails")
	void Login(String username,String password) {
		System.out.println("user: "+username);
		System.out.println("password: "+password);
	}
	@DataProvider(name="userdetails")
	Object[][] TestData() {
		Object arr[][]= {{"Username1","Password1"},{"Username2","Password2"},
				{"Username3","Password3"},{"Username4","Password4"}};
		return arr;
	}
	}
	
	


