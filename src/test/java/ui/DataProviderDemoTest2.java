package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Login with different username and password
public class DataProviderDemoTest2 {
	
	
	/*@Test (dataProvider= "dataSet")
	public void test(String username, String password) {
		
		System.out.println(username+"===="+password);
		
		
		
		
		
		
	}*/
	@Test (dataProvider= "dataSet1")
	public void test1(String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		//System.out.println(username+"===="+password);
	}
	
	@DataProvider
	public Object[][] dataSet1() {
		
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"}, 
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"} 
		};
	}
		
		
		
		
	
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	


