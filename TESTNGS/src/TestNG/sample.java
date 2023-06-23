package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample {

	@Test(dataProvider = "getData")
	public void firstmethod(String name, String anothername) {
		System.out.println("first testng method");
		System.out.println(name);
		System.out.println(anothername);

	}

	@Parameters({ "URL" })
	@Test
	public void secondmethod(String URLname) {
		System.out.println("second testng method");
		System.out.println(URLname);
	}

	@BeforeTest
	public void bfTest() {
		System.out.println("i will execute before executing test");
	}

	@AfterTest
	public void afTest() {
		System.out.println("i will execute after every test");
	}

	@BeforeSuite
	public void bfSuite() {
		System.out.println("i will execute before entire suite ");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("i will execute after entire suite ");
	}

	@BeforeMethod
	public void bfMethod() {
		System.out.println("i will execute before each method in sample");
	}

	@AfterMethod
	public void afMethod() {
		System.out.println("i will execute after each method in sample ");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "vijay";
		data[0][1] = "kumar";
		data[1][0] = "rama";
		data[1][1] = "Krishna";
		data[2][0] = "bokka";
		data[2][1] = "tcs";
		return data;
	}

}
