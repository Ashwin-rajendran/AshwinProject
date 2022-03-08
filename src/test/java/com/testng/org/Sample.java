package com.testng.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	private void userNameValidation() {

		Assert.assertEquals("Ashwin", "Ashwin");
	}

}
