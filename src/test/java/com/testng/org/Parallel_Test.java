package com.testng.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	@Test
	
	private void amazon() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
	}
	
	@Test
	
	private void flipkart() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	}

}