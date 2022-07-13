package iframee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifrm1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://vctcpune.com/selenium/practice.html");
	        Thread.sleep(1000);
	        driver.switchTo().frame("iframe-name");
	        driver.findElement(By.xpath("(//a[text()='Dummy Content for Testing']")).click();
	        
	       // driver.switchTo().defaultContent();
	       // driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	        
}
}
