package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Login with different username and password
public class DataProviderDemoTest {
	
	
	@Test (dataProvider= "dataSet", dataProviderClass= DataProviderDemo.class)
	public void test(String username, String password) {
		
		System.out.println(username+"===="+password);
		
		
		
		
	}
	@Test (dataProvider= "dataSet1", dataProviderClass= DataProviderDemo.class)
	public void test1(String username, String password, String test) {
		
		System.out.println(username+"===="+password+"==="+ test);
	}
	
	
	
	
	
	
	
	
	
	
	

}
