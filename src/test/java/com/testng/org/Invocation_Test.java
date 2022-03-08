package com.testng.org;

import org.testng.annotations.Test;

public class Invocation_Test {
	
@Test
	
	private void shoes() {

		System.out.println("Search shoes");
		
		
	}
	
@Test

private void watch() {

	System.out.println("Search Watch");
}

     @Test(invocationCount = 5)
     
     private void lapTop() {

    	 System.out.println("Search Laptop");
	}
     
     @Test
     private void iphone() {

    	 System.out.println("Search iPhone");
	}
     
     @Test
     
     private void bat() {
    	 
    	 System.out.println("Search Bat");

	}
     
     @Test
     
     private void football() {

    	 System.out.println("Search Football");
	}

}
