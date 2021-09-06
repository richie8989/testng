package common;

import java.io.IOException;

import org.testng.ITestContext; 
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ultilities.Screenshot;

public class Listern extends Screenshot implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is -" + result.getName());
		System.out.println("Test case is starting");
		
		
	}
	
	//send email or zip all the reult
	public void onTestSuccess(ITestResult result) {
	Reporter.log("Status of execution is -" + result.getStatus());
		
	}
	
	//Captured the screenshot
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is starting");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is starting");
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case is starting");
		
	}
	
	public void onStart(ITestContext context) {
		System.out.println("Test case is starting");
		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test case is starting");
		
	}




}
