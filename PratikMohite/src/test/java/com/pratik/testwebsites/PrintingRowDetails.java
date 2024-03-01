package com.pratik.testwebsites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingRowDetails {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get link
		driver.get("https://cosmocode.io/automation-practice-webtable/");


		// Get all the table row elements from the table
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
 
		// And iterate over them and get all the cells
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
//           System.out.println();
			// Print the contents of each cell
			for (WebElement cell : cells) {         
				System.out.print(cell.getText()+"    ");
			}
			System.out.println();
		}
		driver.quit();
		
	}
}
		
	



