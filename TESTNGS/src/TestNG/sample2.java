package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample2 {

	@Test(dependsOnMethods="fourthmethod")
	public void thirdmethod() {
		System.out.println("third testng method");
	}
	@Test
	public void fourthmethod() {
		System.out.println("fourth testng method");
	}
	@BeforeMethod
	public void bfMethod() {
		System.out.println("i will execute before each method in sample2");
	}
	@AfterMethod
	public void afMethod() {
		System.out.println("i will execute after each method in sample2 ");
	}
}
