package vij;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class insecureCertificates {
	
	@Test
	public void grid1() throws MalformedURLException {
		
		
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setBrowserName("edge");
		
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());	
		driver.close();
	}

}
