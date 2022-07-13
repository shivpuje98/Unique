package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTesting {
  @Test
  public void MyMethod() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "D:\\Pooja\\Selenium\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().window().maximize();
       Thread.sleep(2000);
	  
	  
	  
	  
  }
}
