package sizeAndPosition;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeSetting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        System.out.println(driver.manage().window().getSize());
        
        //to set size need to create object of Dimension class and pass width and height
         Dimension d = new Dimension(1111,100);
      
        //using set size method we can set size
        
       driver.manage().window().setSize(d);
        
        
	}

}
