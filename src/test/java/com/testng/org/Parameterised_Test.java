package com.testng.org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised_Test {

	@Test
	@Parameters({ "empname", "empid" })

	private void testData(String empname, int empid) {

		System.out.println("Employee name is :" + empname);
		System.out.println("Employee id is :" + empid);

	}

}
