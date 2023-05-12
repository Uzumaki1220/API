package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_DropDownListCurrency")));

		WebElement dropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select cntry= new Select(dropdown);
		System.out.println(dropdown.getText()); 
		cntry.selectByIndex(2);
		String secondcntry=driver.findElement(By.cssSelector("option[value='AED'] ")).getAttribute("value");
		System.out.println(secondcntry);
		System.out.println(cntry.getFirstSelectedOption().getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("option[value='AED'] ")).isSelected());
		cntry.selectByValue("USD");
		System.out.println(cntry.getFirstSelectedOption().getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("option[value='USD'] ")).isSelected());
		driver.close();
		
		
		
	}

}
