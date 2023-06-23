package FinalFrameworks.shopping;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import FinalFrameworks.pageobjects.LandingPage;

public class StandAlone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("vijay1220@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Vijay@1220");
		driver.findElement(By.cssSelector("#login")).click();
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//List<WebElement>	productsnames=	driver.findElements(By.cssSelector(".mb-3 b"));

		
List<WebElement>	products=	driver.findElements(By.cssSelector(".mb-3"));


WebElement desired =products.stream().filter(p->p.findElement(By.cssSelector("b")).getText().equalsIgnoreCase("ADIDAS ORIGINAL")).findFirst().orElse(null);
desired.findElement(By.cssSelector(".mb-3 button:last-of-type")).click();



//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".toast-container"))));

wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[@class=\"btn btn-custom\"])[3]"))));

wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[@class=\"btn btn-custom\"])[3]"))));

Thread.sleep(1000);

driver.findElement(By.xpath("(//button[@class=\"btn btn-custom\"])[3]")).click();
Thread.sleep(1000);

List<WebElement> cproducts=driver.findElements(By.cssSelector(".cartWrap"));
boolean b=cproducts.stream().anyMatch(c->c.findElement(By.cssSelector("h3")).getText().equalsIgnoreCase("ADIDAS ORIGINAL"));

//Assert.assertTrue(b);

driver.findElement(By.cssSelector("[style*=\"list-style-type: none\"] button")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("[placeholder*=\"Select Country\"]")).sendKeys("india");
//
driver.findElement(By.xpath("//section[@class='ta-results list-group ng-star-inserted']/button[2]")).click();
Thread.sleep(1000);
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".action__submit"))));
//driver.findElement(By.cssSelector(".action__submit")).click();

//List<WebElement> options=driver.findElements(By.xpath("//section[@class='ta-results list-group ng-star-inserted']//span"));
//for(WebElement option:options)
//{
//	
//	if(option.getText().equalsIgnoreCase("INDIA"))
//	{
//
//		option.click();
//		break;
//	}
//}


//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".action__submit"))));

//
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollTo(0,400)");
//Assert.assertTrue(driver.findElement(By.cssSelector(".action__submit")).isEnabled());
Actions a=new Actions(driver);
//a.moveByOffset(1049, 652).click();
a.moveToElement(driver.findElement(By.cssSelector(".action__submit"))).click().build().perform();
//a.moveToElement(driver.findElement(By.cssSelector(".action__submit"))).click();
//driver.findElement(By.cssSelector(".action__submit")).click();
//driver.findElement(By.xpath("//*[text()='Place Order ']")).click();
//driver.findElement(By.xpath("//*[text()='Place Order ']")).click();
//Assert.assertTrue(driver.findElement(By.cssSelector(".action__submit")).isEnabled());
Thread.sleep(1000);

String cfnmessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
Assert.assertEquals("THANKYOU FOR THE ORDER.", cfnmessage);









//List<WebElement>	buttons=	driver.findElements(By.xpath("//div//div[@class='card']//button[@class='btn w-10 rounded']"));
//for(int i=0;i<products.size();i++)
//{
//String name=productsnames.get(i).getText();
//	if(name.equalsIgnoreCase("ZARA COAT 3"))
//	{
//		buttons.get(i).click();
//		break;
//	}
//}



		
	}

	

}

