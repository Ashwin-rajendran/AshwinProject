package com.testng.org;

import org.testng.annotations.Test;

public class Priority_Test {
	
	
@Test(priority = -2)
	
	private void shoes() {

		System.out.println("Search shoes");
		
		
	}
	
@Test(priority = 1)

private void watch() {

	System.out.println("Search Watch");
}

     @Test(priority = -1)
     
     private void lapTop() {

    	 System.out.println("Search Laptop");
	}
     
     @Test(priority = 1)
     private void iphone() {

    	 System.out.println("Search iPhone");
	}
     
     @Test
     
     private void bat() {
    	 
    	 System.out.println("Search Bat");

	}
     
     @Test(priority = 2)
     
     private void football() {

    	 System.out.println("Search Football");
	}
       
}
