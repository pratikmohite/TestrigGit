package com.pratik.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWExample {

	public static void main(String[] args) { 
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testrigtechnologies.com/");
		driver.findElement(By.cssSelector("#copyright > div > div.col.span_7.col_last > ul > li:nth-child(4) > a")).click();
		 
		String s1=driver.getWindowHandle();
		Set<String> s2=driver.getWindowHandles();
		for(String s: s2) {
			if(!(s.equals(s1))) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.cssSelector("#organization_guest_contextual-sign-in > div > section > button")).click();
		driver.findElement(By.cssSelector("#main-content > section.core-rail.mx-auto.papabear\\:w-core-rail-width.mamabear\\:max-w-\\[790px\\].babybear\\:max-w-\\[790px\\] > div > section.core-section-container.my-3.core-section-container--with-border.border-b-1.border-solid.border-color-border-faint.m-0.py-3.locations > div > ul > li:nth-child(1) > a")).click();
		Set<String> s3=driver.getWindowHandles();
		for(String s: s3) {
			driver.switchTo().window(s);
			String name=driver.getTitle();
			if(name.contains("Bing")) {
				System.out.println("Currently on Bing Maps Tab");
				break;
			}
		}
		driver.quit();
		 
		}
		}