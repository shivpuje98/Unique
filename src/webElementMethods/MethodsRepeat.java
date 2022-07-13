package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsRepeat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        
       // WebElement pvr = driver.findElement(By.id("twotabsearchtextbox"));
    	//	 pvr.sendKeys("shoes");
    		// pvr.clear();
       
       
       
     // driver.findElement(By.name("radio")).click();
       Thread.sleep(2000);
       
     // WebElement pvr = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
            //  System.out.println(pvr.getText());
      
       
		/*
		 * WebElement cb = driver.findElement(By.id("checkBoxOption1")); cb.click();
		 * if(cb.isSelected()) { System.out.println("selected"); } else {
		 * System.out.println("not selected "); }
		 */
       
   
   	
		WebElement hide = driver.findElement(By.id("hide-textbox"));
	       WebElement show = driver.findElement(By.id("show-textbox"));
	       
	       WebElement textbox = driver.findElement(By.name("show-hide"));
	       show.click();
	       if(textbox.isDisplayed()) {
	    	   System.out.println("thank you textbox is displayed");
	       }
	       else {
	    	   System.out.println("cant find textbox");
      
       
   
		

	}
	}
	
}


