package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flight_passenger {
	
	
	
public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		Thread.sleep(1000);
		String actual=	 driver.findElement(By.id("spanAudlt")).getText();
				System.out.println(actual);
		Assert.assertEquals(actual,"5");
		driver.findElement(By.cssSelector("#hrefIncChd")).click();
		driver.findElement(By.cssSelector("#hrefIncInf")).click();
		driver.findElement(By.className("buttonN")).click();
		driver.close();
		

	}

{
	
}
}
	
	

