package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement mse = driver.findElement(By.name("cars"));
        Select s=new Select(mse);
        System.out.println("multi select status is "+s.isMultiple());
        s.selectByVisibleText("Volvo");
        Thread.sleep(1000);
        s.selectByValue("saab");
        Thread.sleep(1000);
        s.selectByIndex(2);
        Thread.sleep(1000);
        
        

	}

}
