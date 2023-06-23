package frame.newframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lpage{
WebDriver driver;
	public Lpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//	driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
//	driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
//	driver.findElement(By.id("login")).click();
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginbtn;
	
	
	public void loginApp(String mail,String passw)
	{
		email.sendKeys(mail);
		pass.sendKeys(passw);
		loginbtn.click();
	}
	
	public void goRahul()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}

	

}
