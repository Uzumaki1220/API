package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testng {
	
	WebDriver driver=new ChromeDriver();
	@Test(priority=1)
	public void method()
	
	{
		System.out.println("dasfsdac");
	}
	@Test(priority=2)
	public void loginpage()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("session_key")).sendKeys("Vijay1220");

		driver.findElement(By.id("session_password")).sendKeys("Vijay@1220");
		driver.close();
	}

}
