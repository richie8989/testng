package ui;

import org.testng.ITestContext; 
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listern implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting");
		
		
	}
	
	//send email or zip all the reult
	public void onTestSuccess(ITestResult result) {
	
		
	}
	
	//Captured the screenshot
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is starting");
		
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
