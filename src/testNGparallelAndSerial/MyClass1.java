package testNGparallelAndSerial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void kiteLogin() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      Thread.sleep(2000);
  }
}
