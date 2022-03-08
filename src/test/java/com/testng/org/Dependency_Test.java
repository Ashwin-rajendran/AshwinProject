package com.testng.org;

import org.testng.annotations.Test;

public class Dependency_Test {
	
	@Test(dependsOnMethods = "openBrowser")
	
	private void signIn() {

		System.out.println("Sign in Account");
	}
	
	@Test
	
	private void openBrowser() {

		System.out.println("Open the Browser");
	}
	
	
	@Test(dependsOnMethods = "signIn")
	
	private void logOut() {

		System.out.println("Log out account");
	}

}
