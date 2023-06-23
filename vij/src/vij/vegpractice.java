package vij;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vegpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] needed= {"Orange","Apple","Brocolli"};
		int reqcount=5;
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
	List<WebElement> names=driver.findElements(By.cssSelector("h4[class='product-name']"));
	int i;
	for( i=0;i<names.size();i++)
	{
	String name=	names.get(i).getText();
	String actualname=name.split(" ")[0];

	
		System.out.println(actualname);
		
		List neededlist=Arrays.asList(needed);
		if(neededlist.contains(actualname))
			
		{
			for(int j=0;j<5;j++)
			{
			driver.findElements(By.cssSelector("div a[class='increment']")).get(i).click();
			driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
			
			}
			
		}
	}
	}

}
