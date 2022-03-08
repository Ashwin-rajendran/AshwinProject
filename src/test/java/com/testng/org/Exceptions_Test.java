package com.testng.org;

import org.testng.annotations.Test;

public class Exceptions_Test {
	
	@Test
	private void add() {

		int i = 10;
		int j = 20;
		
		System.out.println("Add:"+(i+j));
		
		}
	
	@Test(expectedExceptions = Exception.class)
	private void divide() {

		int i = 10;
		int j = 0;
		System.out.println("divide:"+(i/j));
		}

}
