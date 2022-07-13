package screenshotts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrnshot1 {

	public static void main(String[] args) throws InterruptedException, IOException   {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination=new File("D:\\JAVA\\myscreenshot\\myscreenshot.png");
       FileHandler.copy(source, destination);
        
		
	}

}
