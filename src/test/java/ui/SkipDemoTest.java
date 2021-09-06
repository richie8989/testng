package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = true;
	
	//This won't shown at all
	@Test(enabled=false)
	public void skipTest1() {
		
		System.out.println("Skipping thiss test as it is not complete");
		
	}
	@Test
	public void skipTest2() {
		
		System.out.println("Skipping test 2");
		throw new SkipException("Skiiping this test");
		
		
	}
	@Test
public void skipTest3() {
		System.out.println("Skipping test based on condition");	
		
		if(datasetup==true) {
			
			System.out.println("Excute the test");	
		}
		else {
			
			System.out.println("Do not excute further steps");
			throw new SkipException("Skiiping this test");
		}
		
		
		
		
		

}





}
