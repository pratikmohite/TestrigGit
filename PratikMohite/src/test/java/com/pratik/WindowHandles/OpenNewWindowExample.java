package com.pratik.WindowHandles;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewWindowExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        // Locate the button that opens a new window
        driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Iterate through each window handle and switch to the new window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        // Print the title of the new window
        System.out.println("Title of New Window: " + driver.getTitle());

        // Close the new window
        driver.quit();
	}

}
