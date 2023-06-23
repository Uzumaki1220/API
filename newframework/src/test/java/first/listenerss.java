package first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerss implements ITestListener{
	
	
	WebDriver driver=new ChromeDriver();
	public  void onTestSuccess(ITestResult result) {
	   
		
		
	  }

	  public  void onTestFailure(ITestResult result) {
		  
		  
		  File nn=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(nn, new File("C:\\Users\\hariv//220.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  
	  }
	
}
