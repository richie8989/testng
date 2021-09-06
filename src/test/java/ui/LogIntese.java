package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIntese {
	
	
	@BeforeTest
public void loginToApp() {
		System.out.println("Login To App");
	}
		
		@AfterTest
	public void loginFromoApp() {
		System.out.println("Login From App");
	}
		@BeforeMethod
	public void connectToDb() {
		System.out.println("DB Connected");
	}
		
	@AfterMethod
	public void DudconnectToDb() {
		System.out.println("DB Didconnected");
	}
	
	
	@Test(priority=1, description= "This is a Login test")
	
	public void logintest() {
		
		System.out.println("Login Sucessful");
		
	}
@Test(priority=2, description= "This is a Logout test")

public void logoutTest() {
	
	
	System.out.println("Logout is Successful");
}





		}
	
	


