package vij;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] needed = { "Muskmelon - Striped", "Banana - Robusta", "Watermelon - Small",
				"Muskmelon - Netted Small" };
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("input")).sendKeys("fruits");

		// driver.findElement(By.id("input")).sendKeys((Keys.ENTER));
		driver.findElement(By.cssSelector("button[class*='bb-search']")).click();
		Thread.sleep(2000);
		List<WebElement> fruits = driver.findElements(By.cssSelector("div[qa='product_name'] a"));
		Thread.sleep(2000);
		List neededlist = Arrays.asList(needed);
		int i;
		for (i = 0; i < fruits.size(); i++) {
			String fruit = fruits.get(i).getText();
			System.out.println(fruit);
			if (neededlist.contains(fruit)) {

				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).clear();
				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).sendKeys("2");
				driver.findElements(By.cssSelector("button[qa='add']")).get(i).click();
				Thread.sleep(1000);
			}

		}
		
		driver.findElement(By.cssSelector("span[class='basket-content']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[qa='viewBasketMB']")).click();

		// driver.close();
		
		
		
		
		
		

	}

}
