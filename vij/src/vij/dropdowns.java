package vij;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {

		// invoking
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32");

		// explicit wait object
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);

		// list all options in a list of webelement

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		for (WebElement option : options) // for each loop
		{
			if (option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
			}
		}

		Thread.sleep(1000);

		// select drop down
		// collect the select dropdown weblement

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		// create obj for select class and perform select for above webelement
		Select cntry = new Select(dropdown);
		System.out.println(dropdown.getText());
		cntry.selectByIndex(2);
		String secondcntry = driver.findElement(By.cssSelector("option[value='AED'] ")).getAttribute("value");
		System.out.println(secondcntry);
		System.out.println(cntry.getFirstSelectedOption().getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("option[value='AED'] ")).isSelected());
		cntry.selectByValue("USD");
		System.out.println(cntry.getFirstSelectedOption().getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("option[value='USD'] ")).isSelected());
		Thread.sleep(1000);

		// dynamic drop down

		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		Thread.sleep(1000);
		String actual = driver.findElement(By.id("spanAudlt")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "5");
		driver.findElement(By.cssSelector("#hrefIncChd")).click();
		driver.findElement(By.cssSelector("#hrefIncInf")).click();
		driver.findElement(By.className("buttonN")).click();
		driver.close();

	}
}
