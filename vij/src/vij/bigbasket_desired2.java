package vij;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigbasket_desired2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] fruits = { "Muskmelon - Striped", "Banana - Robusta", "Watermelon - Small",
				"Muskmelon - Netted Small" };
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/ps/?q=fruits&nc=as");

		driver.manage().window().maximize();

		driver.findElement(By.id("input")).sendKeys("fruits");

		driver.findElement(By.cssSelector("button[class*='bb-search']")).click();
		Thread.sleep(2000);

		for (String fruit : fruits) {
			addfruit(driver, fruit, "4");

		}

//		addfruit(driver,"Muskmelon - Striped","3");
//		addfruit(driver,"Muskmelon - Netted Small","2");
//		addfruit(driver,"Banana - Robusta","2");

		driver.findElement(By.cssSelector("span[class='basket-content']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.cssSelector("button[qa='viewBasketMB']")).click();

		// driver.close();

	}

	public static void addfruit(WebDriver driver, String fruitname, String count) throws InterruptedException {

		List<WebElement> fruits = driver.findElements(By.cssSelector("div[qa='product_name'] a"));
		Thread.sleep(2000);

		for (int i = 0; i < fruits.size(); i++) {
			String singlefruit = fruits.get(i).getText();
			System.out.println(singlefruit);

			if (fruitname.equals(singlefruit)) {
				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).clear();

				driver.findElements(By.cssSelector("input[ng-model='vm.startQuantity']")).get(i).sendKeys(count);

				driver.findElements(By.cssSelector("button[qa='add']")).get(i).click();
			}

		}

	}
}
