package Elements;
import Constants.constant;
import Registrationform.MultipleUser.multipleUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class element {
               
	private WebDriver driver;   
		@FindBy(css = "#firstName")
		public WebElement fName;
		@FindBy(css = "#lastName")  
		public WebElement lName;
		@FindBy(css = "#userEmail")
		public WebElement em;
		@FindBy(css = "#userNumber")
		public WebElement mob;
		@FindBy(css="#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)")
		public WebElement gender;
//		@FindBy(css="#dateOfBirthInput")
//		public WebElement dateOfBirth;
		@FindBy(css="#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")
		public WebElement subject;
		@FindBy(css="#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)")
		public WebElement hobbies;
		@FindBy(css="#currentAddress")
		public WebElement address;
		@FindBy(css="#state > div > div.css-1wy0on6 > div > svg")
		public WebElement statedropdown;
		@FindBy(css="#state > div > div.css-1hwfws3 > div.css-1uccc91-singleValue")
		public WebElement state;
		@FindBy(css="#city > div > div.css-1wy0on6 > div")
		public WebElement citydropdown;
		@FindBy(css="#city > div > div.css-1hwfws3 > div.css-1uccc91-singleValue")
		public WebElement city;
		@FindBy(xpath="//*[@id=\"submit\"]")
		public WebElement submit;
		
		
		
		
		public element(WebDriver driver) {
//			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
}
