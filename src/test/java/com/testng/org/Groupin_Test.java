package com.testng.org;

import org.testng.annotations.Test;

public class Groupin_Test {
	
	
	
	@Test(groups = "Employee details")
	
	private void employeeId() {

		System.out.println("Employee ID is 12");
	}
	
	@Test(groups = "Employee details")
	
	private void employeeName() {

		System.out.println("Employee Name is Ashwin");
	}

	@Test(groups = "Personal details")
	
	private void personalAddress() {

		System.out.println("Nandanam");
	}
	
	@Test(groups = "Personal details")
	
	private void personalNumber() {

		
		System.out.println("9095867726");
		
	}
	@Test(groups = "Bank details")
	
	private void bankName() {

		System.out.println("Union bank");
	}
	
	@Test(groups = "Bank details")
	
	private void bankAccountnumber() {

		System.out.println("32443535353326");
		}
}
