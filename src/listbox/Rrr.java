package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rrr {

	public static void main(String[] args) throws InterruptedException {
	
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://auth.discoveryplus.in/login");
       Thread.sleep(5000);
        driver.findElement(By.id("mobileNumber")).sendKeys("9673456236");
        Thread.sleep(5000);
       WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
     System.out.println(getotp.isEnabled());
       
       
     // WebElement hide = driver.findElement(By.id("hide-textbox"));
    //  Thread.sleep(5000);
	//WebElement show = driver.findElement(By.id("show-textbox"));
	//WebElement textbox = driver.findElement(By.name("show-hide"));
	//if(textbox.isDisplayed()) {
	//	System.out.println("Thank you text box is displayed");
	//}else {
		//System.out.println("cant find textbox");
		
	//}
//	hide.click();

	}
        
	}

       

        
