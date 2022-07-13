package popupp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendiv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        driver.findElement(By.name("q")).sendKeys("one plus 10r");
        Thread.sleep(100);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
