package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import classname.Loginpage;

public class Loginapp {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium course\\Browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://stagesite5-identity.medrio.com/identity/login?signin=7ea0d8872214cb36fa2be9d2771abb10");
		driver.manage().window().maximize();
		Loginpage lp=new Loginpage(driver);
		lp.username().sendKeys("aj39r");
		lp.password().sendKeys("Medrio2222");
		
	}

}
