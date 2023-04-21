package vij;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Extras {
	
	
	@Test
	public void https() {
		
		ChromeOptions options=new ChromeOptions();
//to accept insecure https
		options.setAcceptInsecureCerts(true);
	Proxy  p=new Proxy();
	p.setHttpProxy("ipaddress:444");
	options.setCapability("proxy", p);
	
//to add extensions in remote browser		options.addExtensions(new File ("path"));
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32");
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}

}
