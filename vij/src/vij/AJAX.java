package vij;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJAX {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("http://google.com");
//
//		WebElement search = driver.findElement(By.cssSelector("#APjFqb"));
//		
//		Actions a = new Actions(driver);
//		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("vijay").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER)
//				.build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//*[text()='Vijay (actor)']"))).contextClick().sendKeys(Keys.ENTER)
//				.sendKeys(Keys.ENTER).build().perform();
//		driver.close();

//		drag and drop

//		driver.get("https://jqueryui.com/droppable/");
//
//		driver.switchTo().frame(0);
//
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement destiantion = driver.findElement(By.id("droppable"));
//
//		Actions a = new Actions(driver);
//
//		a.dragAndDrop(source, destiantion).build().perform();
		
		//calender

		driver.get("https://jqueryui.com/droppable/");

		driver.findElement(By.linkText("Datepicker")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		
	//WebElement month=	driver.findElement(By.className("ui-datepicker-month"));
		
	
		
		
		
	while(!driver.findElement(By.className("ui-datepicker-month")).getText().equalsIgnoreCase("December"))
			
		{
		
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			//Thread.sleep(1000);
			
		}
	
	
	List<WebElement>days=driver.findElements(By.className("ui-state-default"));
	

		for(int i=0;i<days.size();i++)
		{
			String day=days.get(i).getText();
			
			if(day.equalsIgnoreCase("10"))
			{
				days.get(i).click();
			}
		}
		
		
		
 File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
 FileUtils.copyFile(ss, new File("C:\\Users\\hariv\\calender.png"));
	}
}
	
