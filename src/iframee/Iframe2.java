package iframee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
        
        
        String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
        System.out.println(text);
        
        Thread.sleep(2000);
        
        driver.switchTo().frame("frame2");
         WebElement text1 = driver.findElement(By.id("animals"));
         Select s=new Select(text1);
         System.out.println(s.isMultiple());
         s.selectByIndex(2);
         s.selectByValue("babycat");
         
         
         Thread.sleep(2000);
         driver.switchTo().parentFrame();
         driver.switchTo().frame("frame1");
         driver.findElement(By.tagName("input")).sendKeys("shiv");
         
         Thread.sleep(2000);
         //driver.switchTo().parentFrame();
         driver.switchTo().frame("frame3");
         driver.findElement(By.id("a")).click();
         
         
         
         
         
        
        
        
       
	}

}
