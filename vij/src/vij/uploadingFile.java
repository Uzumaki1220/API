package vij;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
	
	//	driver.findElement(By.xpath("//span[contains(text(),'Select PDF files')]")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\hariv\\Downloads\\upload.exe");
		Thread.sleep(1000);
		driver.findElement(By.id("processTaskTextBtn")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
