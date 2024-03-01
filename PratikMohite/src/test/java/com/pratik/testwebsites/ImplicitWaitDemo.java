package com.pratik.testwebsites;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement w1= driver.findElement(By.cssSelector("#seo-core-layout > div:nth-child(3) > div > div.sc-dISpDn.CMEUE > div.sc-cWSHoV.ceMABa > div.sc-dCFHLb.cZLvve > div > h2"));
		String txt= w1.getText();
		if(w1.isDisplayed()) {
			System.out.println(txt);
		}
		
		else {
			System.out.println("Not displayed");
		}
		
		 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement btn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='restaurants curated for pizza']")));
	        btn.click();
	        String mesg=btn.getText();
	        driver.quit();
		if(btn.isSelected()) {
			System.out.println(mesg);
		}
		else {
			System.out.println("Button not clicked");
		}
 
	}

}
