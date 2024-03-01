package Utility;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.element;

public class utilityMethods {
	public void Click(WebElement ele) {
		ele.click();
		}
		 
		public void sendData(WebElement ele, String data) {
			ele.sendKeys(data);
		}

}


