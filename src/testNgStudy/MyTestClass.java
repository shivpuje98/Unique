package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void atul() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().window().maximize();
      Thread.sleep(2000);
  }
  @Test
  public void atul1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
  }
      
      
      
      

	
	  
	  
	  
	  
	  
  }

