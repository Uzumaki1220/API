package first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ssOnFail {

	  WebDriver driver = new ChromeDriver();
	 ExtentReports ex;
//	@BeforeTest
//	public  void extReports() {
//		String path = System.getProperty("user.dir")+"\\reports\\extentreports.html" ;
//		ExtentSparkReporter repo = new ExtentSparkReporter(path);
//		repo.config().setReportName("vijay web");
//		repo.config().setDocumentTitle("test results");
//		
//		 ex = new ExtentReports();
//		ex.attachReporter(repo);
//		ex.setSystemInfo("tester", "vijay");
//		
//
//	}

	@Test
	public void tes() 
	{
	
	//	ex.createTest("test1");
		
		driver.get("https://www.google.com/");
		
		//ex.flush();
		driver.close();
		
		
		
		//ss();
		
	}

//	public  File ss() throws IOException {
//
//		File nn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(nn, new File("C:\\Users\\hariv//22.png"));
//		return new File("C:\\Users\\hariv//22.png");
//
//	}

}
