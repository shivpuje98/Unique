package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        KiteLoginPage klp=new KiteLoginPage(driver);
        klp.senduserName();
        klp.sendpassword();
        klp.clickonloginButton();
        Thread.sleep(2000);
        
        Pinpage pp=new Pinpage(driver);
        pp.sendpin();
        pp.continuebutton();
        Thread.sleep(2000);
        
       KiteHomePage khp=new KiteHomePage(driver);
        khp.validateuserName();
        khp.logoutButton();
        Thread.sleep(2000);
        driver.close();
        
     
        

	}

}
