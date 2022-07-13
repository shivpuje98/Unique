package miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Underlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
       driver.findElement(By.name("q")).sendKeys("Honda");
        Thread.sleep(200);
        
       List<WebElement> sr = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
       System.out.println(sr.size());
       
       for(WebElement t:sr)
       {
    	   System.out.println(t.getText());
       }
       
       for(WebElement w:sr)
       {
    	   String actualtext = w.getText();
    	  String expectedtext = "honda bikes";
    	  
    	  if(actualtext.equals(expectedtext))
    	  {
    		  w.click();
    		  break;
    	  }
       }
    	  System.out.println("===============");
    	 driver.findElement(By.linkText("Images")).click();
    	 
  List<WebElement> images = driver.findElements(By.tagName("img"));
         System.out.println(images.size());
         
    	  
    	  
    	  
    	   
       
       
       
       
       
       
       
        
		
		
	}

}
