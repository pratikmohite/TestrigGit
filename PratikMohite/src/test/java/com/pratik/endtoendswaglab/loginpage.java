package com.pratik.endtoendswaglab;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement uname=driver.findElement(By.cssSelector("#user-name"));
		uname.sendKeys("standard_user");
		
		WebElement pass=driver.findElement(By.cssSelector("#password"));
		pass.sendKeys("secret_sauce");
		
		WebElement loginbtn=driver.findElement(By.cssSelector("#login-button"));
		loginbtn.click();
		System.out.println("User is on HomePage");
		

		String firstWindowHandle=driver.getWindowHandle();
		
		String secondWindowHandle="";
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle: allWindowHandles) {
			if(!(handle.equals(firstWindowHandle))) {
				secondWindowHandle=handle;
				driver.switchTo().window(handle);
			}
		}
		 
		driver.findElement(By.cssSelector("#item_4_title_link > div")).isDisplayed();
		WebElement addcartbtn=driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button"));
         addcartbtn.click();
         
         WebElement cartsym=driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path"));
         cartsym.click();
         

	        

	        String thirdWindowHandle = "";
	        for (String handle : allWindowHandles) {
	            if (!handle.equals(firstWindowHandle) && !handle.equals(secondWindowHandle)) {
	                thirdWindowHandle = handle;
	                driver.switchTo().window(handle);   
	            }
	        }
	        
	        WebElement checkoutbtn=driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button"));
             checkoutbtn.click();
             

 	        String fourthWindowHandle = "";
 	        for (String handle : allWindowHandles) {
 	            if (!handle.equals(firstWindowHandle) && !handle.equals(secondWindowHandle) && !handle.equals(thirdWindowHandle)) {
 	                fourthWindowHandle = handle;
 	                driver.switchTo().window(handle);   
 	            }
 	        }
 	        
 	        WebElement chofname=driver.findElement(By.cssSelector("#first-name"));
 	        chofname.sendKeys("Pratik");
 	        
 	        WebElement cholname=driver.findElement(By.cssSelector("#last-name"));
 	        cholname.sendKeys("Mohite");
 	        
 	        WebElement chozipcode=driver.findElement(By.cssSelector("#postal-code"));
 	        chozipcode.sendKeys("415302");
 	        
 	        WebElement chocontibtn=driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input"));
 	        chocontibtn.click();
 	        
 	       String fifthWindowHandle = "";
	        for (String handle : allWindowHandles) {
	            if (!handle.equals(firstWindowHandle) && !handle.equals(secondWindowHandle) && !handle.equals(thirdWindowHandle) && !handle.equals(fourthWindowHandle)) {
	                fifthWindowHandle = handle;
	                driver.switchTo().window(handle);   
	            }
	        }
	        
	       WebElement billfinishbtn= driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button"));
           billfinishbtn.click() ;
           
           driver.close();
             
         
         
	}

}
