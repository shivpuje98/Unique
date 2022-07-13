package sizeAndPosition;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positionset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        //to set position we need to create object of point class and pass x and y coordinates
        
        System.out.println(driver.manage().window().getPosition());
        Point p=new Point(50,9);
        
        //using setPosition method we set the browser position
       driver.manage().window().setPosition(p);
	}

}
