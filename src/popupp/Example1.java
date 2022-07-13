package popupp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.id("confirmBox")).click();
        
         
        
       //Alert  = driver.switchTo().alert();
        
        Alert alt= driver.switchTo().alert();
      System.out.println(alt.getText());
       
     // Thread.sleep(100);
      // alt.dismiss();
      // alt.accept();
		
	}

}
