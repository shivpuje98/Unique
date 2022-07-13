package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
         Thread.sleep(2000);
         
         
         //for date
         WebElement datebox = driver.findElement(By.name("birthday_day"));
         Select s=new Select(datebox);
         s.selectByValue("8");
         Thread.sleep(2000);
         
         //for month
         WebElement monthbox = driver.findElement(By.id("month"));
         Select m=new  Select(monthbox);
         m.selectByIndex(7);
         Thread.sleep(2000);
         
         //for year
         WebElement yearbox = driver.findElement(By.id("year"));
         Select t=new  Select(yearbox);
         t.selectByValue("1996");
         Thread.sleep(2000);
         
         //gender
         driver.findElement(By.xpath("//input[@value='1']")).click();
         Thread.sleep(5000);
         //driver.quit();
	}

}
