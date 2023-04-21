package vij;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {
 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	String desired= "realme 10 Pro 5G (Nebula Blue, 128 GB)";
	System.out.println(desired);
	

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
//driver.switchTo().alert().dismiss();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
Thread.sleep(1000);

driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(desired);
driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);

//
//WebElement cross = wait.until(
//    ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
//cross.click();


//
//List<WebElement> ALLitems= driver.findElements(By.cssSelector(".product-name"));
//System.out.println(ALLitems);
//for(int k=0;k<ALLitems.size();k++)
//{
//	System.out.println(ALLitems.get(k).getText());
//}
//List desiredlist=Arrays.asList(desired);
//int j=0;
//for(int i=0;i<ALLitems.size();i++)
//	{
//	
//		String[] itemname=ALLitems.get(i).getText().split(" ");
//		String exactname=itemname[0];
//		System.out.println(exactname);
//		
//		
//		if(desiredlist.contains(exactname))
//		{
//			j++;
//			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//			
//			if(j==desired.length)
//			{
//				break;
//			}
//			
//		}
//		
//		}
//Thread.sleep(1000);
//driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']//button[@type='button']")).click();
//
//
//
//
//
//
//
//
}
}
