package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        JavascriptExecutor j= ((JavascriptExecutor)driver);
       j.executeScript("Window.scrollBy(80,900)");
        Thread.sleep(2000);
        
        j.executeScript("Window.scrollBy(80,2000)");
        Thread.sleep(2000);
        
       // j.executeScript("Window.scrollBy(80,-2000)");
       // Thread.sleep(2000);
	
	}

}
