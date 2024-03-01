package Registrationform.MultipleUser;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.constant;
import Elements.element;
import Utility.excelUtility;


public class excelRegisterForm {
	
	static excelUtility eu=new excelUtility();
	static String excelFilePath = constant.Path_TestData + constant.File_TestData;

	public static void main(String[] args) throws IOException, InterruptedException {
		  
		eu.setExcelFile(excelFilePath,"Sheet1");
		
		for(int i=0; i<eu.getRowCountInSheet(); i++) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.constant.URL);
			element ele = new element(driver);
			ele.fName.sendKeys(eu.getCellData(i,0));
	    	ele.lName.sendKeys(eu.getCellData(i,1));
	    	ele.em.sendKeys(eu.getCellData(i,2));
	    	ele.mob.sendKeys(eu.getCellData(i,3));
	    	ele.address.sendKeys(eu.getCellData(i,4));
	    	
	    	Thread.sleep(1000);
	    	driver.quit();
		
		driver.quit();
	}

}
}
