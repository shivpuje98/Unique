package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodssss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
       // driver.findElement(By.xpath("//input[@class='topbarInputBox footerInput']")).sendKeys("8888888888");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//input[@class='topbarInputBox footerInput']")).clear();
        
       // driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']")).click();
        
       // driver.manage().window().maximize();
       // driver.manage().window().minimize();
        
       // driver.quit();
        
       // driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']")).click();
        
       // driver.findElement(By.xpath("//div[@style='display: flex; justify-content: center; align-items: center;  ']")).click();
       // Thread.sleep(3000);
        
        
      //  WebElement checkBoxOption1= driver.findElement(By.name("checkBoxOption1"));
       // checkBoxOption1.click();
		//if(checkBoxOption1.isSelected()) {
       // 	System.out.println("already selected");
      //  }else {
        	//checkBoxOption1.click();
      //  	System.out.println("checkBoxOption1 is now selected");
        	
      //  }
		
		
		
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

	}}
