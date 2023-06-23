package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.chrome.driver", "path");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("session_key")).sendKeys("Vijay1220");

		driver.findElement(By.id("session_password")).sendKeys("Vijay@1220");
		driver.close();
	}
}
