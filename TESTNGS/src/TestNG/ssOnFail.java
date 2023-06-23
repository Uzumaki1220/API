package TestNG;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ssOnFail {
	
	WebDriver driver;

	@Test
	public void ss()
	{
		File scrsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}
	
	@BeforeTest
	public void ext()
	{
		String path = System.getProperty("user.dir")+"\\reports\\extentreports.html" ;
		ExtentSparkReporter e=new ExtentSparkReporter(path);
		e.config().setReportName("Sss");
				e.config().setDocumentTitle("vv");
				
				ExtentReports er=new ExtentReports();
				er.attachReporter(e);

	}
	
	
}
