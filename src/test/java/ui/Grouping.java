package ui;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Grouping {
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Run this before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Run this after class");
	}
	
	@BeforeGroups(value="Regression")
	public void beforegroups() {
		System.out.println("Run this before regression");
	}
	@AfterGroups(value= "Regression")
	public void afteregroups() {
		System.out.println("Run this before regression");
	}
	
	
	@Test(priority=1,groups= "Regression")
	
	public void logintest() {
		
		System.out.println("Login Sucessful");
		
	}
@Test(priority=2, description= "This is a Logout test", groups= "BVT")

public void logoutTest() {
	
	
	System.out.println("Logout is Successful");
}

@Test
(groups="BVT")
public void Test3() {
	
	
	System.out.println("Test3");


		}
@Test
(groups={"BVT", "Regressions"})
public void Test4() {
	
	
	System.out.println("Test4");
}


}



	
	


