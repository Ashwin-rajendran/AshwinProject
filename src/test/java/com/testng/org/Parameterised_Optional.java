package com.testng.org;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised_Optional {
	
	@Test
	@Parameters({ "empname", "empid" })

	private void testData(@Optional("gowtham")String empname, int empid) {

		System.out.println("Employee name is :" + empname);
		System.out.println("Employee id is :" + empid);

}
}