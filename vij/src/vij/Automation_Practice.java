package vij;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

//		List<WebElement> amounts = driver.findElements(By.xpath("//div/table[@id='product']/tbody/tr/td[4]"));
//		int sum = 0;
//		for (int i = 0; i < amounts.size(); i++) {
//			String a = amounts.get(i).getText();
//			int b = Integer.parseInt(a);
//			sum = sum + b;
//		}
//		System.out.println(sum);
//
//		List<WebElement> aamounts = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
//		int ssum = 0;
//		for (int j = 0; j < aamounts.size(); j++) {
//			String c = aamounts.get(j).getText();
//			int d = Integer.parseInt(c);
//			ssum = ssum + d;
//		}
//		System.out.println(ssum);
//		// css- .tableFixHead td:nth-child(4)
		
		
		
		List<WebElement>names=driver.findElements(By.xpath("//div/table[@id='product']/tbody/tr/td[2]"));
		List<String>	og=names.stream().map(s->s.getText()).collect(Collectors.toList());
	long c=og.stream().filter(s->s.startsWith("E")).count();
	List<String> n=og.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());
	System.out.println(og);
	System.out.println(c);
	System.out.println(n);

		
//		for(int v=0;v<names.size();v++)
//		{
//			String name=names.get(v).getText();
//			System.out.println(name);
//	
//		
//		}
	//driver.close();
		

	}

}
