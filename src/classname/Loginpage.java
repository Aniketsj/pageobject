package classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By name1=By.name("username_");
	By passwor=By.id("password");
	
	public WebElement username12()
	{
		return driver.findElement(name1);
	}
	
	public WebElement password()
	{
		return driver.findElement(passwor);
	}

	@FindBy(name="username_")
	WebElement username1;
	
	public WebElement usernamecall()
	{
		return username1;
	}
	
	
}
