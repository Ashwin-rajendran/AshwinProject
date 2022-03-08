package com.testng.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	
	@BeforeSuite
	
	private void setUp() {
		
		System.out.println("Chrome Driver Setup");
		

	}
	@BeforeTest
	
	private void url() {
		System.out.println("Amazon url Passed");
		

	}
	@BeforeClass
	
       private void signIn() {
		
    	   System.out.println("SignIn");
    	    	   
    	   
	}
	@BeforeMethod
	private void homePage() {
		
		System.out.println("Go to Amazon page");

	}
	
	@Test
	private void bat() {
		System.out.println("Search bat");

	}
       
	@Test
	
	private void watch() {
		
          System.out.println("Search Watch");
	}
	
	@Test
	
	private void shoes() {
		System.out.println("Screenshot");
		

	}
	
	@AfterMethod
	private void screenShot() {
		
		System.out.println("ScreenShot");

	}
	
	@AfterClass
	private void signOut() {

		System.out.println("sign out the page");
	}
	@AfterTest
	
	private void deleteCookies() {
		
		System.out.println("Delete the Cookies");

	}
	@AfterSuite
	
	private void quite() {

		System.out.println("Quite the Browser");
	}
	
	
	
	

}
