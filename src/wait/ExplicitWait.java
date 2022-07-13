package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
      WebElement au = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
      WebDriverWait ww= new  WebDriverWait(driver,Duration.ofSeconds(30));
      ww.until(ExpectedConditions.visibilityOf(au));
      au.click();
      
       
  
       
      
       
     
       
        
        
        

	}

}
