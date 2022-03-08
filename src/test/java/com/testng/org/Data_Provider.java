package com.testng.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider = "datas")
	private void testData(String empname , int empid) {
		
		System.out.println("Employee name is :"+empname);
		System.out.println("Employee id is :" + empid);

	}
		
@DataProvider
private  Object[][] datas() {
	
	return new Object[][] {{"Ashwin",25},{"gowtham",45}};

	
}
		
		
		

}
