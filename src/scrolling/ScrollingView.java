package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        
        
     WebElement ref = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
     JavascriptExecutor j= ((JavascriptExecutor)driver);
     Thread.sleep(3000);
     j.executeScript("arguments[0].scrollIntoView(true)",ref);
     

	}

}
