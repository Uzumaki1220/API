package Frameworks.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import FinalFrameworks.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	public WebDriver driver;
	public LandingPage landing;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\hariv\\eclipse-workspace\\shopping\\src\\main\\java\\frameworks\\resources\\globalprops.properties");
		prop.load(fs);
		String browser = prop.getProperty("browser");

		if (browser.contains("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

	@BeforeMethod(alwaysRun = true)

	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();

		landing = new LandingPage(driver);
		landing.goTO();
		return landing;
	}

	@AfterMethod(alwaysRun = true)
	public void teardDown() {
		driver.close();
	}
	@DataProvider
	public Object[][] data()
	{
	//	HashMap<String,String> map = new HashMap<String,String>();
	HashMap<String,String > map=	new HashMap<String,String>();
	map.put("email","vijay1220@gmail.com");
	map.put("password","vijay1220");
	map.put("productName","ZARA COAT 3");

	HashMap<String,String > map1=	new HashMap<String,String>();
	map1.put("email", "kumar122@gmial.com");
	map1.put("pass", "kumar122");
	map1.put("productName","ADIDAS ORIGINAL");
	return new Object[][]{{map,map1}};
	} 


}
