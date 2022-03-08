package com.testng.org;

import org.testng.annotations.Test;

public class Dependency_Groups {

@Test(dependsOnGroups = "setup")
	
	private void viewAccount() {

	System.out.println("View the Account");
	
	}
	
	
	@Test(groups = "setup")
	
	private void openBrowser() {

		System.out.println("Open the Browser");
	}
	
	
	@Test(groups = "setup")
	
	private void logOut() {

		System.out.println("Log out account");
	}
	
	//@Test
	
	//private void quit() {
 
		//System.out.println("Quit the browser");
	}
	
	

