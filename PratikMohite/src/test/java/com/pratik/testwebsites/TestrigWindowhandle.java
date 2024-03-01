package com.pratik.testwebsites;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestrigWindowhandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testrigtechnologies.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"copyright\"]/div/div[2]/ul/li[4]/a/i")).click();
		String cid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		
		for(String id:allid) {
			if(!(id.equals(cid))){
				driver.switchTo().window(id);
			}
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/button/icon")).click();
		
		
	}

}
