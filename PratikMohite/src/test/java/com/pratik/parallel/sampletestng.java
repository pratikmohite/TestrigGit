package com.pratik.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class sampletestng {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void Setup() {
		driver=new ChromeDriver();
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void openflipkart() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Open Flipkart","It should land on homepage");
		test.info("INFO:Verifies book can be added to cart");
		driver.get("https://practice.automationtesting.in/");
		test.log(Status.INFO,"Landed on HomePage");
		driver.findElement(By.cssSelector("#text-22-sub_row_1-0-2-0-0 > div > ul > li > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#text-22-sub_row_1-0-2-0-0 > div > ul > li > a.added_to_cart.wc-forward")).isDisplayed();
		test.log(Status.INFO,"Clicked on Add to Basket Button");
		driver.findElement(By.cssSelector("#text-22-sub_row_1-0-2-0-0 > div > ul > li > a.added_to_cart.wc-forward")).click();
		test.log(Status.INFO,"Landed on Cart Page");
		WebElement book;
		try {
			book = driver.findElement(By.cssSelector("#page-34 > div > div.woocommerce > form > table > tbody > tr.cart_item > td.product-name > a "));
			test.pass("Book is Displayed on cart page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail("Book is not displayed on cart Page");
		}
		/*
		 * if(book.isDisplayed()) { test.pass("Book is Displayed"); } else {
		 * test.fail("Book is not displayed"); }
		 */
	}
	@AfterSuite	
	public void close() {
		extent.flush();
		driver.quit();
	}
}
