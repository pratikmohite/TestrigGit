package com.pratik.testwebsites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableAutomation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait
		Wait<WebDriver> wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		//get link
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		//number of rows
		List<WebElement> er=driver.findElements(By.xpath("//tr"));
		System.out.println("Number of rows in a Table :"+er.size());
		
		//number of colums
		List<WebElement> ed=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
        System.out.println("Number of Colums: "+ed.size());
        
        //displaying column names
        for(WebElement e : ed) {
   		 String s1=e.getText();
   		 System.out.println(""+s1);
   		 driver.close();
   	 }
	}

}
