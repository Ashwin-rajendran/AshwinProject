package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
@Test
	
	private void amazon() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
		 
		String actual = driver.getTitle();
		System.out.println(actual);
		
		String expected = "Online Shopping site India";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		s.assertAll();
	}

}
 