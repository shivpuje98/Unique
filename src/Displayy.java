import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://vctcpune.com/selenium/practice.html");
       
       WebElement hide = driver.findElement(By.id("hide-textbox"));
       WebElement show = driver.findElement(By.id("show-textbox"));
       
       WebElement textbox = driver.findElement(By.name("show-hide"));
       hide.click();
       if(textbox.isDisplayed()) {
    	   System.out.println("thank you textbox is displayed");
       }
       else {
    	   System.out.println("cant find textbox");
       }
       
	}

}
