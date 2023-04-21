package vij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AJAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://google.com");

		WebElement search = driver.findElement(By.cssSelector("#APjFqb"));
		Actions a = new Actions(driver);
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("vijay").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER)
				.build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Vijay (actor)']"))).contextClick().sendKeys(Keys.ENTER)
				.sendKeys(Keys.ENTER).build().perform();
		driver.close();

	}

}
