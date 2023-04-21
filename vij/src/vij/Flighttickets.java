package vij;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flighttickets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] data = {  "Student","Family and Friends", "Senior Citizen", "Indian Armed Forces" };

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// country
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);

		// list all options in a list of webelement

		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		for(int v=0;v<options.size();v++)
		{
			String cntname=options.get(v).getText();
			System.out.println(cntname);
		}
		for (WebElement option : options) // for each loop
		{
			if (option.getText().equalsIgnoreCase("INDIA")) {
				option.click();
				break;
			}
		}

		Thread.sleep(1000);

		// locations,date

		driver.findElement(By.cssSelector("td label.select-label")).click();

		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.cssSelector("a[value='HYD']")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='GOI']"))
				.click();

		driver.findElement(By.cssSelector("td[class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();

		// checkboxes

		List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		System.out.println(boxes.size());

		List<WebElement> names = driver.findElements(By.cssSelector("label[for*='ctl00_mainContent_chk']"));
		List datalist = Arrays.asList(data);

		for (int i = 1; i < names.size(); i++) {
			String name = names.get(i).getText();
			System.out.println(names.get(i).getText());

			if (datalist.contains(name)) {
				names.get(i).click();
				Thread.sleep(1000);
				Assert.assertTrue(boxes.get(i).isSelected());

			}

		}

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
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#hrefIncChd")).click();
//		driver.findElement(By.cssSelector("#hrefIncInf")).click();
		driver.findElement(By.className("buttonN")).click();
		
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
		driver.findElement(By.xpath("//span/input[@value='Search']")).click();
		Thread.sleep(1000);
		driver.close();
	}
}