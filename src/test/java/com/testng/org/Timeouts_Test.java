package com.testng.org;

import org.testng.annotations.Test;

public class Timeouts_Test {
	
	@Test
	private void login() {

		System.out.println("User Login");
	}

	@Test(timeOut = 8000)
	
	private void logout() throws InterruptedException {
		
		Thread.sleep(5000);

		System.out.println("User Logout");
	}

}
