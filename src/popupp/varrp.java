package popupp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class varrp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.name("q")).sendKeys("mouse pointer");
        Thread.sleep(200);
        
        driver.findElement(By.xpath("(//span[text()='mouse pointer'])[10]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(1000);
        
        
        
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        
	}

}
