package vij;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bigbasket_desired {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		String[] needed = { "Muskmelon - Striped", "Banana - Robusta", "Watermelon - Small",
//				"Muskmelon - Netted Small" };
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("input")).sendKeys("fruits");

		driver.findElement(By.cssSelector("button[class*='bb-search']")).click();
		Thread.sleep(2000);

		addfruit(driver, "Muskmelon - Striped", "3");
		addfruit(driver, "Muskmelon - Netted Small", "2");
		addfruit(driver, "Banana - Robusta", "2");

		// driver.findElement(By.xpath("//button[@id=\"headlessui-menu-button-:R5bclm:\"]")).click();

//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//		w.until(ExpectedConditions
//				.elementToBeClickable(driver.findElement(By.cssSelector(".dropdown-toggle.meganav-shop"))));
//		driver.findElement(By.cssSelector(".dropdown-toggle.meganav-shop")).click();
//
//		WebElement breverages = driver.findElement(By.xpath("(//a[text()=\"Beverages\"])[2]"));
//
//		Actions a = new Actions(driver);
//
//		a.moveToElement(breverages).build().perform();
//
//		WebElement Tea = driver.findElement(By.xpath("(//a[@class='ng-binding l2select'])[2]"));
//		w.until(ExpectedConditions.visibilityOf(Tea));
//		a.moveToElement(Tea).build().perform();
//
//		WebElement GreenTea = driver.findElement(By.xpath("(//a[text()='Green Tea'])[2]"));
//		a.moveToElement(GreenTea).perform();
//		
//		//Thread.sleep(2000);
//		
//	
//
//a.moveToElement(Tea).perform();
//Thread.sleep(1000);
////
//		a.moveToElement(GreenTea).click().build().perform();

		driver.findElement(By.cssSelector("span[class='basket-content']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button[qa='viewBasketMB']")).click();

		// driver.close();

	}

	public static void addfruit(WebDriver driver, String fruit, String count) throws InterruptedException {

		List<WebElement> fruits = driver.findElements(By.cssSelector("div[qa='product_name'] a"));
		Thread.sleep(2000);

		for (int i = 0; i < fruits.size(); i++) {
			String singlefruit = fruits.get(i).getText();
			System.out.println(singlefruit);

			if (fruit.equalsIgnoreCase(singlefruit)) {
				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).clear();

				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).sendKeys(count);

				driver.findElements(By.cssSelector("button[qa='add']")).get(i).click();
			}

		}

	}
}
