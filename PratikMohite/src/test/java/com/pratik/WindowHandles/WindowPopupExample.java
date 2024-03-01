package com.pratik.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowPopupExample {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        // Clicking the "Click Here" link to open a pop-up window
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        // Switching to the pop-up window
        String mainWindowHandle = driver.getWindowHandle(); // Store the main window handle
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Perform actions on the pop-up window
        System.out.println("Title of the pop-up window: " + driver.getTitle());

        // Close the pop-up window
        driver.close();

        // Switching back to the main window
        driver.switchTo().window(mainWindowHandle);

        // Perform further actions on the main window if needed

        driver.quit();

	}

}
