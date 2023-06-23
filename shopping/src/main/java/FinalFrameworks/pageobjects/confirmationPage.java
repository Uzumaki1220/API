package FinalFrameworks.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstracts;

public class confirmationPage extends abstracts {
	WebDriver driver;
	
	public confirmationPage(WebDriver driver)
	
	{
		super(driver);
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="")
	WebElement message;

	
	String cfnmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
public String getVerifyMessage()
{
return	message.getText();
	
}

}
