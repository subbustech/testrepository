package com.mysite.regression;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FullTest4 {
	
	@Test(dataProvider="getData")
	public void Test1(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
		
	@DataProvider
	public Object[][] getData() {
		//First combination - firstun and firstpw
		//Second combination - secondun and secondpw
		//Third combination - thirdun and thirdpw
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstun";
		data[0][1] = "firstpw";
		
		data[1][0] = "secondun";
		data[1][1] = "secondpw";
		
		data[2][0] = "thirdun";
		data[2][1] = "thirdpw";
		return data;
	}

}


