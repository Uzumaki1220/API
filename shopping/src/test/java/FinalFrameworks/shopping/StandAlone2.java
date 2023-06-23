package FinalFrameworks.shopping;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FinalFrameworks.pageobjects.OrderPage;
import FinalFrameworks.pageobjects.ProductCatalouge;
import FinalFrameworks.pageobjects.cartPage;
import FinalFrameworks.pageobjects.checkoutPage;
import FinalFrameworks.pageobjects.confirmationPage;
import Frameworks.TestComponents.baseTest;

public class StandAlone2 extends baseTest {
	
	
	String productName = "adidas original";
	String countryName = "india";
	@Test(dataProvider="data",groups= {"purchase"})
	public void submitOrder(HashMap<String,String> input) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		
		
		
		landing.Login(input.get("email"),input.get("password") ); // create objs for nxt
		ProductCatalouge productCatalouge =new 	ProductCatalouge(driver);																					// pages in current page
																								// and return the next
																								// nxt page obj in
																								// maintest
		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addProductToCart(input.get("productName"));
		productCatalouge.goToCartPage(); // we can call gotocartpage form any of the child class obj
		cartPage cartPage = new cartPage(driver);													// since its declared in parent abstract

		Boolean match = cartPage.VerifyProductDisplay(input.get("productName"));
	//Assert.assertTrue(match);
		Thread.sleep(1000);
		cartPage.goToCheckout();
		checkoutPage checkout=new checkoutPage(driver);
		checkout.selectCountry(countryName);
		checkout.submitOrder();
		confirmationPage confirmationPage=new confirmationPage(driver);

		String message = confirmationPage.getVerifyMessage();

		Assert.assertTrue(message.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		

	}

@Test(dependsOnMethods= {"submitOrder"})
public void OrderHistoryTest()
{
	//"ZARA COAT 3";
	ProductCatalouge productCatalouge = landing.Login("anshika@gmail.com", "Iamking@000");
	OrderPage ordersPage = productCatalouge.goToOrdersPage();
	Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	
}
//
//@DataProvider
//public Object[][] getData() {
//	   
//	return new Object[][] {{"anshika@gmail.com","Iamking@000","ZARA COAT 3"},{"shetty@gmail.com","Iamking@000","ADIDAS ORIGINAL"}};
//}

}
