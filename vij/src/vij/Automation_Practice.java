package vij;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.ssl.ClientAuth;

public class Automation_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		
//		List<WebElement> elements = driver.findElements(By.cssSelector(".gf-t td:nth-child(1)"));
//		List<String> names = elements.stream().map(s -> s.getText()).collect(Collectors.toList());
//		// System.out.println(names);
//		List<WebElement> links = driver.findElements(By.cssSelector(".gf-t td:nth-child(1) a"));
//		String newtabclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
//
//		for (int i = 1; i < links.size(); i++) {
//			System.out.println(links.get(i).getText());
//			links.get(i).sendKeys(newtabclick);
//		}
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		System.out.println(windows);
//		System.out.println(it);
//		while (it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//
//		}
//		driver.close();
		
		
									//FRAMES SCROLLING
//		WebElement iframe1 = driver.findElement(By.cssSelector("#courses-iframe"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,1000)");
//		driver.switchTo().frame(0);
//		System.out.println(driver.findElement(By.cssSelector(".top-left li")).getText());	
//		js.executeScript("window.scrollTo(0,1500)");
//		System.out.println(driver.findElement(By.cssSelector("li [class='icon fa fa-envelope']")).getText());	
//		js.executeScript("window.scrollTo(0,500)");

		
		
		
		
//									driver.get("https://jqueryui.com/droppable/");
//									driver.manage().window().maximize();
//									WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
//									driver.switchTo().frame(frame1);
//									WebElement draggable = driver.findElement(By.cssSelector("body #draggable"));
//									WebElement droppable = driver.findElement(By.cssSelector("body #droppable"));
//
//									Actions a = new Actions(driver);
//									a.dragAndDrop(draggable, droppable).build().perform();
		
		
		
						//ELEMENT DISPLAYED OR NOT
		
//	//	 driver.findElement(By.cssSelector("#show-textbox")).click();
//		driver.findElement(By.cssSelector("#hide-textbox")).click();
//		String showbtn = driver.findElement(By.cssSelector("#displayed-text")).getAttribute("style");
//		System.out.println(showbtn);
//		if (showbtn.equalsIgnoreCase("display: block;")) {
//			System.out.println("displayed");
//		} else {
//			System.out.println("Hidden");
//		}
//
//		driver.close();
		
		
		
									//sample
//	System.out.println(driver.findElements(By.cssSelector("tbody tr th")).size());	
//	
//	System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
//System.out.println(driver.findElement(By.xpath("(//table[@name=\"courses\"]//td[2])[2]")).getText());	
		
									//SCROLL
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,600)");
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

//	List<WebElement> names=	driver.findElements(By.cssSelector("tbody tr td:nth-child(2)"));
//	for(int i=0;i<names.size();i++)
//	{
//	System.out.println(names.get(i).getText());	
//	}
//	driver.close();
		
		
		
										//SWITCH
		
//		driver.findElement(By.cssSelector("#alertbtn")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.cssSelector("#confirmbtn")).click();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(1000);
//		driver.close();
	

//	  	driver.findElement(By.cssSelector("#openwindow")).click();
//		Set<String> w = driver.getWindowHandles();
//		Iterator<String> it = w.iterator();
//		String p = it.next();
//		String c = it.next();
//		for (int i = 0; i < w.size(); i++) {
//			System.out.println(w);
//		}
//
//		System.out.println(w.size());
//		driver.switchTo().window(c);
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
	
//	WebElement link = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));

	/* String newtab=Keys.chord(Keys.CONTROL, Keys.ENTER);
  		link.sendKeys(newtab); */
					
							//or
	
	
	//		Actions a = new Actions(driver);
//
//		a.moveToElement(link).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
//
//		Set<String> w = driver.getWindowHandles();
//		Iterator<String> it = w.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(child);
//		Thread.sleep(1000);
//		driver.close();
//		driver.switchTo().window(parent);
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("a [class='btn btn-primary']")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
		
	//RADIO BUTTONS	
		
//	List<WebElement> names = driver.findElements(By.cssSelector("label[for*='radio']"));
//
//	String[] input = { "Radio1", "Radio2", "Radio3" };
//	List inputList = Arrays.asList(input);
//
//	List<WebElement> buttons = driver.findElements(By.cssSelector(".radioButton"));
//	for (int i = 0; i < names.size(); i++) {
//		String radioname = names.get(i).getText();
//		System.out.println(radioname);
//		if (inputList.contains(radioname)) {
//			buttons.get(i).click();
//			System.out.println("done");
//
//		}
//	}
//		
		
		//AUTO SUGGESTIVE
		
		
		
		
		//driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("in");
//		Thread.sleep(1000);
//	List<WebElement> auto=	driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
//System.out.println(auto.size());
//
//
//Thread.sleep(2000);
//
//
//for(WebElement option:auto)
//{
//	if(option.getText().equalsIgnoreCase("INDIA"))
//	{
//		option.click();
//		break;	
//	}
//	
//}
//for(int i=0;i<auto.size();i++) 
//{
//	String cname=auto.get(i).getText();
//	System.out.println(cname);
//
//	
//	if(cname.equalsIgnoreCase("India"))
//	{
//		auto.get(i).click();
//		break;
//	}
//
//
//}


									//select

//WebElement s = driver.findElement(By.id("dropdown-class-example"));
//
//
//Select ss = new Select(s);
//
//		
//ss.selectByIndex(1);
//System.out.println(ss.getFirstSelectedOption().getText());
//
//Thread.sleep(1000);
//ss.selectByValue("option3");
//System.out.println(ss.getFirstSelectedOption().getText());

										//CHECKBOX
		
		
//	List<WebElement>	checkboxes=driver.findElements(By.xpath("//div[@class='right-align']//label"));
//	String[] req= {"Option1","Option3"};
//	List<String> reqList=Arrays.asList(req);
//	List<WebElement> boxes=driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));
//	
//	for(int i=0;i<checkboxes.size();i++)
//	{
//		String checkname=checkboxes.get(i).getText();
//		System.out.println(checkname);
//		
//		if(reqList.contains(checkname))
//		{
//			boxes.get(i).click();
//		}
//		
//		
//		
//	}
		
	
		
		
		
		


		
	}

}
