package com.pratik.testwebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IframesAutomation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("/html/body/div/span"));
		System.out.println(e1.getText());
		
		driver.quit();

	}

}
