package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.rogers.com/");
       driver.manage().window().maximize();
       Thread.sleep(5000);
      driver.findElement(By.xpath("//span[text()='ON']")).click();
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("(//a[@title='Nova Scotia'])[1]")).click();
 Thread.sleep(1000);      
       
//        WebElement df = driver.findElement(By.xpath("//li[text()='   Select a Province   ']"));
//       Select s=new Select( df);
      // System.out.println("multi select status is "+s.isMultiple());
//       s.selectByVisibleText(" Alberta ");
//       Thread.sleep(1000);
//       s.selectByVisibleText("  British Columbia ");
//       Thread.sleep(1000);
//       s.selectByVisibleText("  Manitoba  ");
//       Thread.sleep(1000);
//       s.selectByValue("saab");
//       Thread.sleep(1000);
//       s.selectByIndex(2);
//       Thread.sleep(1000);
//       

	}

}
