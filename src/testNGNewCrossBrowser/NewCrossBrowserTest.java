package testNGNewCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewCrossBrowserTest {
	@Parameters("browserName")
	  @Test
	  public void MyTest(String name) throws InterruptedException {
		  WebDriver driver =null;
		  if(name.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "D:\\Pooja\\Selenium\\geckodriver.exe");
		       driver = new FirefoxDriver();
		  }
		  else if(name.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
		         driver = new ChromeDriver();
		  }
		  
		  
		  driver.get("https://vctcpune.com/selenium/practice.html");
	      driver.manage().window().maximize();
	       Thread.sleep(2000);
	}
}
