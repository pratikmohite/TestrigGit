package Registrationform.MultipleUser;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.element;
import Utility.utilityMethods;

public class multipleUser {
	    String firstName;
		String lastName;
		String email;
		String mobile;
//		public static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		JSONParser jsonParser =new JSONParser();
		FileReader reader =new FileReader(Constants.constant.Path_TestData+Constants.constant.File_TestData);
		Object obj = jsonParser.parse(reader);
		JSONArray usersList = (JSONArray) obj;
		for(int i=0;i<usersList.size();i++) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get(Constants.constant.URL);
			JSONObject users = (JSONObject) usersList.get(i);
			String firstName=(String)users.get("firstName");
			String lastName=(String)users.get("lastName");
			String email=(String)users.get("email");
			String mobile=(String)users.get("mobile");
			String address=(String)users.get("address");
			element e=new element(driver);
			utilityMethods ulmethods=new utilityMethods();
			ulmethods.sendData(e.fName, firstName);
			ulmethods.sendData(e.lName, lastName);
			ulmethods.sendData(e.em,email);
			ulmethods.sendData(e.mob,mobile);
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200)", "");
			ulmethods.Click(e.gender);
			ulmethods.sendData(e.address, address);
			ulmethods.Click(e.hobbies);
			js.executeScript("window.scrollBy(0,500)", "");
			ulmethods.Click(e.submit);
			driver.quit();
			System.out.println(i);
           
	}
}
}


	

