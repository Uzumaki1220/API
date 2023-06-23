package FinalFrameworks.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstracts;

public class LandingPage extends abstracts{

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//PageFactory
	@FindBy(css = "#userEmail")
	WebElement emailele;
	@FindBy(css = "#userPassword")
	WebElement passwordele;
	@FindBy(css = "#login")
	WebElement loginbutton;
	@FindBy(css = "[class*=flyInOut]")
	WebElement errormessage;
	
	public ProductCatalouge Login(String email,String password) 
	{
		emailele.sendKeys(email);
		passwordele.sendKeys(password);
		loginbutton.click();
		ProductCatalouge productCatalouge = new ProductCatalouge(driver);
		return productCatalouge;
	}
	
	public String getErrorMessage() {
		waitforElementToAppear(errormessage);
		return errormessage.getText();
		
	}
	
	public void goTO()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}

}
