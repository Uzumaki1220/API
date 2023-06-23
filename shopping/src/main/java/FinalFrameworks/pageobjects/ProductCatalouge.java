package FinalFrameworks.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstracts;

public class ProductCatalouge extends abstracts {

	WebDriver driver;

	public ProductCatalouge(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// PageFactory
	@FindBy(css = ".mb-3")
	List<WebElement> products;
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy=By.cssSelector(".mb-3");
	By addToCart= 	By.cssSelector(".card-body button:last-of-type");
	By toastMessage=By.cssSelector(".toast-container");
	

	public List<WebElement>  getProductList()
	{
		
		waitforLocatorToAppear(productsBy);
		
		return products;
	}
	


	
	public WebElement getProductByName(String productName)
	{
		WebElement prod =getProductList().stream().filter(p->p.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
return prod;
	}
	
	
	public void addProductToCart(String productName)
	{
	WebElement prod=	getProductByName(productName);
		prod.findElement(addToCart).click();
		waitforLocatorToAppear(toastMessage);
		waitforElementToDisappear(spinner);
		

	}



}


