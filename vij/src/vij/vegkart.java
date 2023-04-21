package vij;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vegkart {
 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	String[] desired= {"Brocolli","Beans","Capsicum","Mango"};
	String countryy="India";
	System.out.println(desired);
WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();
List<WebElement> ALLitems= driver.findElements(By.cssSelector(".product-name"));
System.out.println(ALLitems);
//for(int k=0;k<ALLitems.size();k++)
//{
//	System.out.println(ALLitems.get(k).getText());
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
Thread.sleep(1000);
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']//button[@type='button']")).click();

driver.findElement(By.cssSelector(".promocode")).sendKeys("VIJAY");

Thread.sleep(1000);

driver.findElement(By.cssSelector(".promoBtn")).click();
Thread.sleep(1000);

//driver.navigate().back();
driver.findElement(By.xpath("//button[text()='Place Order']")).click();

WebElement s=driver.findElement(By.xpath("//div/select"));

Select ct=new Select(s);

ct.selectByValue(countryy);

driver.findElement(By.cssSelector(".chkAgree")).click();

driver.findElement(By.xpath("//*[text()='Proceed']")).click();
Thread.sleep(1000);




	}
}
