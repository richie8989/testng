package common;

import org.testng.ITestResult;
import org.testng.Reporter;

public class DotTestListener {
	
	 
	  public void onTestFailure(ITestResult tr) {
	    Reporter.log("Method name is");
	  }
	 
	  public void onTestSkipped(ITestResult tr) {
	    log("S");
	  }
	 
	  public void onTestSuccess(ITestResult tr) {
	    log(".");
	  }
	 
	  private void log(String string) {
	    System.out.print(string);
	    if (++m_count % 40 == 0) {
	      System.out.println("");


}
