package FinalFrameworks.shopping;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import FinalFrameworks.pageobjects.ProductCatalouge;
import FinalFrameworks.pageobjects.cartPage;
import Frameworks.TestComponents.baseTest;

public class errorValidations extends baseTest {

	@Test(groups={"vijay"})
	public void LoginError() throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		String productName = "adidas original";
		String countryName = "india";

		landing.Login("vijay1220@gmail.com", "12345"); // create objs for nxt
		Assert.assertEquals("Incorrect email or password.", landing.getErrorMessage());

	}

	@Test(groups={"vijay"})
	public void ProductErrorValidation() throws IOException, InterruptedException {

		String productName = "ZARA COAT 3";
		ProductCatalouge productCatalouge = landing.Login("rahulshetty@gmail.com", "Iamking@000");
		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addProductToCart(productName);
		cartPage cartPage = productCatalouge.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);

	}
}
