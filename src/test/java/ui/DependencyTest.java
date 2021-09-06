package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void userRegristration() {
		
		System.out.println("This is test a");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= "userRegristration",alwaysRun=true)
	public void UserSearch() {
		System.out.println("This is test 1");
	}

	@Test
	public void Reporttest2() {
		Reporter.log("This is test 2");
		System.out.println("This is test 2");
	}

	@Test
	public void Reporttest3() {
		System.out.println("This is test 3");
	}

	@Test
	public void Reporttest4() {
		System.out.println("This is test 4");
	}

	@Test
	public void Reporttest5() {
		System.out.println("This is test 5");

	}

}
