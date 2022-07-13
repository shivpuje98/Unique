package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Extra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
       WebElement lb = driver.findElement(By.name("dropdown-class-example"));
        Select s=new Select(lb);
        s.selectByVisibleText("Option3");
//        s.selectByValue("option1");
//        s.selectByIndex(1);
//	
}
}
       // driver.findElement(By