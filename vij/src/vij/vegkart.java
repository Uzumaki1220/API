package vij;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vegkart {
	static String[] desired= {"Brocolli","Beans","Capsicum","Mango"};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	String countryy="India";
	System.out.println(desired);
WebDriver driver=new ChromeDriver();

WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();


additems(driver);




driver.findElement(By.cssSelector("img[alt='Cart']")).click();


driver.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']//button[@type='button']")).click();

driver.findElement(By.cssSelector(".promocode")).sendKeys("VIJAY");



driver.findElement(By.cssSelector(".promoBtn")).click();


////driver.navigate().back();

WebElement msg=driver.findElement(By.className("promoInfo"));

w.until(ExpectedConditions.visibilityOf(msg));




driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//
WebElement s=driver.findElement(By.xpath("//div/select"));

Select ct=new Select(s);

ct.selectByValue(countryy);

driver.findElement(By.cssSelector(".chkAgree")).click();

driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}


	


public static void additems(WebDriver driver )
{
	List<WebElement> ALLitems= driver.findElements(By.cssSelector(".product-name"));
	System.out.println(ALLitems);
	//for(int k=0;k<ALLitems.size();k++)
	//{
//		System.out.println(ALLitems.get(k).getText());
	//}
	List desiredlist=Arrays.asList(desired);
	int j=0;
	for(int i=0;i<ALLitems.size();i++)
		{
		
			String[] itemname=ALLitems.get(i).getText().split(" ");
			String exactname=itemname[0];
			System.out.println(exactname);
			
			
			if(desiredlist.contains(exactname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==desired.length)
				{
					break;
				}
				
			}
			
			}
}

	}

