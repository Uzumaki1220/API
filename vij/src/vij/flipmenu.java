package vij;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipmenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
selection(driver);
Thread.sleep(3000);
product(driver);





	
	
	
	
	
	
	
	
	}
	
	
	
	
	public static void product(WebDriver driver)
	{
		List<WebElement>names=driver.findElements(By.cssSelector("a[class='IRpwTa']"));
		System.out.println(names.size());
		for(int j=0;j<10;j++)
		{
			
		
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i).getText();
			System.out.println(name);	
			
			
		}
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		}
	}
	
	
	
	
public static void selection(WebDriver driver) throws InterruptedException
{
driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
WebElement fashion=driver.findElement(By.xpath("(//div[@class=\"_1psGvi SLyWEo\"]/div/div)[1]"));


Actions a=new Actions(driver);

a.moveToElement(fashion).build().perform();

Thread.sleep(2000);
WebElement mens=driver.findElement(By.xpath("//a[text()=\"Men Footwear\"]"));
a.moveToElement(mens).build().perform();

WebElement sandals=driver.findElement(By.xpath("//a[text()=\"Men's Sandals & Floaters\"]"));
a.moveToElement(sandals).click().build().perform();



	}

}
