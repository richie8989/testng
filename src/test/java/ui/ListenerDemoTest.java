package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseClass;

public class ListenerDemoTest extends BaseClass {

	
	@Test(retryAnalyzer= common.Retry.class)
	public void launchApp( ) {
	
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}
	
	
}
