package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
       // driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
        driver.getTitle();
        System.out.println(driver.getTitle());
          String title = driver.getTitle();
          driver.getCurrentUrl();
          System.out.println(driver.getCurrentUrl());
          String Url = driver.getCurrentUrl();
          
}
	
}
