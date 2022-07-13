package testNGparallelAndSerial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void facebookLaunch() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      Thread.sleep(2000);
      
      
      
      
  }
  }

