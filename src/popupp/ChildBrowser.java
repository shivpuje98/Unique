package popupp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
       String id = driver.getWindowHandle();
        System.out.println(id);
        
        driver.findElement(By.name("NewWindow")).click();
       Thread.sleep(2000);
        
       Set<String> ids = driver.getWindowHandles();
       System.out.println(ids);
       System.out.println("==========");
       
       
       Iterator<String> it = ids.iterator();
      // while(it.hasNext())
      // {
    	 //  System.out.println(it.next());
    	   
     //  }
       
                   String id1 = it.next();
                   String childpage = it.next();
     
       driver.switchTo().window(childpage);
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("okayy");
       
       
       driver.switchTo().window(id);
      WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
      System.out.println(text.getText());
      
      //driver.close();
      driver.quit();
       
 
       
       
        
	}

}
