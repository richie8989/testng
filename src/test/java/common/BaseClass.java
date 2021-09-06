package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	
@AfterSuite
	public void closingBrowser() {
		
	driver.close();	
	}
	
	
	

}
