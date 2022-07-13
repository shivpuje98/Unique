package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        WebElement userID = driver.findElement(By.id("userid"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        
        userID.sendKeys("ELR321");
        password.sendKeys("Dhana1111");
        login .click();
        
        Thread.sleep(2000); 
      WebElement pin = driver.findElement(By.id("pin"));
      WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']")); 
      
      pin.sendKeys("982278");
      continueButton.click();
      Thread.sleep(2000); 
      
      
      WebElement usrNme = driver.findElement(By.xpath("//span[@class='user-id']"));
      String actualuserID = usrNme.getText();
      String expecteduserID="ELR321";
      
      if(actualuserID.equals(expecteduserID))
      {
    	  System.out.println("user ID matching TC is passed");
      }
      else{
    	System.out.println("user ID is not matching TC is passed");  
      }
      usrNme.click();
      Thread.sleep(100); 
      
      driver.findElement(By.xpath("//a[@target='_self']")).click();
      Thread.sleep(3000);
      driver.close();
      
        
	}
}

