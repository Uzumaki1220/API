package vij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepo {
	WebDriver driver=new ChromeDriver();
	 ExtentReports er;
	
	@BeforeTest
	public void ExtentReports()
	{
		String path = System.getProperty("user.dir")+"\\reports\\extentreports.html" ;

		
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		esr.config().setReportName("vijay");
		esr.config().setDocumentTitle("vreports");
		 er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("tes", "vijay");
		
		
	}
	@Test
	public void method()
	
	{
		
		er.createTest("method");
		System.out.println("dasfsdac");
		er.flush();
	}
	@Test
	public void loginpage()
	{
	
		er.createTest("loginpage");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("session_key")).sendKeys("Vijay1220");

		driver.findElement(By.id("session_password")).sendKeys("Vijay@1220");
		driver.close();
		er.flush();		
	}

}
