package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class sample3 {

	@Test(groups= {"smoke"})
	public void fifthmethod() {
		System.out.println("fifth testng method");
	}
	@Test
	public void sixthmethod() {
		System.out.println("sixth testng method");
	}

}
