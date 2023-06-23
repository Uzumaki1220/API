package FinalFrameworks.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstracts;

public class checkoutPage extends abstracts{
WebDriver driver;
	public checkoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	@FindBy(xpath ="//button[contains(@class,'ta-item')][2]")
	WebElement selectCountry;
	@FindBy(css=".action__submit")
	WebElement submit;
	By results=By.cssSelector(".ta-results");
	
	
	public void selectCountry(String countryName)
	{
		Actions a=new Actions(driver);
		a.sendKeys(country, countryName).build().perform();
		waitforLocatorToAppear(results);
		selectCountry.click();
	}
	
	public confirmationPage submitOrder() {
		submit.click();
		confirmationPage confirmationPage=new confirmationPage(driver);
		return confirmationPage;
	}

	
}
