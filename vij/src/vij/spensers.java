package vij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spensers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.spencersonline.com/");
driver.manage().window().maximize();
driver.findElement(By.id("ltkpopup-close-button")).click();

driver.findElement(By.xpath("//a[@href='/section/lingerie/213.uts']")).click();
int productsSize=driver.findElements(By.cssSelector(".product-card__name")).size();
for(int i=0;i<productsSize;i++)
{
String 	names=driver.findElements(By.cssSelector(".product-card__name")).get(i).getText();
	System.out.println(names);
}
driver.findElement(By.xpath("//a[@href='/section/lingerie/213.uts?itemsPerPage=48&pageNumber=2")).click();

	}

}
