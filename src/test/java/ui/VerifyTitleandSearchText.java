package ui;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//actual n execpted


public class VerifyTitleandSearchText {
	
	@Test
	public void titlentext() {
		SoftAssert softass= new SoftAssert();
		String expected= "Electronics, Ccars, Fashion, Collectibles & More | eBay";
		String expect= "Sewwwarch";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	String actual= driver.getTitle();
	softass.assertEquals("Verification fail", expected, actual);
	System.out.println(actual);
	
	
	
	String actuals= driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	softass.assertEquals(expect, actuals);
	
	softass.assertAll();
	
		
		
	}
	
	
		
	
	

		
		
	}


