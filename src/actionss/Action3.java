package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        
        //how to sendkeys using action class
       WebElement textbox = driver.findElement(By.id("autocomplete"));
      // textbox.sendKeys("good day");
       
       Actions act= new Actions(driver);
       
       act.sendKeys(textbox, "good day").perform();
       
       //how to handle drop down using action class 
       
       WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));

       //using action class method handle drop down
       
       act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       
		
	}

}
