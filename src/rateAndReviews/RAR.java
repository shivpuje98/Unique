package rateAndReviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RAR {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        driver.findElement(By.name("q")).sendKeys("one plus 10r");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click(); 
        
       List<WebElement> rtt = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
      System.out.println(rtt.size());
      
      for(WebElement ab:rtt)
      {
    	  System.out.println(ab.getText());
      }
     
     
        
        
        
	}

}
