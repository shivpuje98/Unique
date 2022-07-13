package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
	
	public void openBrowser()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
		  //ChromeOptions opt=new  ChromeOptions();
		  driver = new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");
		  Reporter.log("launching browser",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		     

		  
		  
	}
	

}
