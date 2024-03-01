package com.pratik.parallel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePage {

	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")
	private WebElement addBasketButton;
	
	HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println(Thread.currentThread().getId());
		driver.close();
	}
	
	void clickAddBasketBtn() {
		addBasketButton.click();
	}
	

}
