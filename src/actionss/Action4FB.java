package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        
       WebElement day = driver.findElement(By.id("day"));
       
       Actions act=new Actions(driver);
       act.click(day).perform();
       
       for(int i=1;i<=9;i++)
       {
    	   act.sendKeys(Keys.ARROW_DOWN).perform();
    	   
       }
       act.sendKeys(Keys.ENTER).perform();
       
       WebElement fn = driver.findElement(By.name("firstname"));
       //fn.sendKeys("thiss");
       Thread.sleep(2000);
       act.keyDown(fn,Keys.SHIFT).sendKeys("t").keyUp(Keys.SHIFT).sendKeys("uu").build().perform();
       
       
       
       
	
	
	

	}
}


