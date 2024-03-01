package com.pratik.Trycatch;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TryCatchExample {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
          
            driver.get("https://www.google.com");
            driver.findElement(By.id("nonexistent-element")).click();

        }
            
        catch (NoSuchElementException e) {
          
            System.out.println("Element not found:**************** " );//+ e.getMessage());
        } finally {        
            driver.quit();
	}

}
}
