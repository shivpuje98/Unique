package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        
       WebElement seleniumbutton = driver.findElement(By.linkText("Selenium"));
       
       Actions act=new  Actions(driver);
       
       act.moveToElement(seleniumbutton).perform();
       act.click().perform();
       
       //act.moveToElement(seleniumbutton).click().build().perform();
       
       act.click(seleniumbutton).perform();
       
       //right click using action class
       
       WebElement rghtclk = driver.findElement(By.xpath("//span[text()='right click me']"));
       act.contextClick(rghtclk).perform();
       
       //how to double click using action class
       WebElement dblclk = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       act.doubleClick(dblclk).perform();
       
       
       		
	}

}
