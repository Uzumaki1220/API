package vij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iphone {

	@Test
	public void login() {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click().build().perform();
		driver.findElement(By.name("email")).sendKeys("9848471220");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Vijay@1220");

		driver.findElement(By.id("signInSubmit")).click();

		System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
		driver.close();
	}

}
