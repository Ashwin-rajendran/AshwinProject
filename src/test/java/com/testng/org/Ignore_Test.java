package com.testng.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Ignore
	@Test
	
	private void shoes() {

		System.out.println("Search shoes");
		
		
	}
	
@Test

private void watch() {

	System.out.println("Search Watch");
}

     @Test
     
     private void lapTop() {

    	 System.out.println("Search Laptop");
	}
     
     @Test(enabled = false)
     private void iphone() {

    	 System.out.println("Search iPhone");
	}
}
