package FinalFrameworks.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstracts;

public class cartPage extends abstracts {

	WebDriver driver;

	public cartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// PageFactory
	@FindBy(css = ".cartSection h3")
	List<WebElement> productTitles;
	
	@FindBy(css = ".totalRow button")
	WebElement checkout;
	
	
public Boolean VerifyProductDisplay(String productName)

{
	
	Boolean match = productTitles.stream()
			.anyMatch(c -> c.getText().equalsIgnoreCase(productName));

return match;

}
public checkoutPage goToCheckout()
{
	checkout.click();
checkoutPage checkout=new checkoutPage(driver);
return checkout;

}


}


