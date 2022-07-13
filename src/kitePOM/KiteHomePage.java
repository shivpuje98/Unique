package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
		
       @FindBy(xpath="//span[@class='user-id']")private WebElement userid;
       @FindBy(xpath="//a[@target='_self']")private WebElement logoutbutton;
       
       
       public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
		}
       
       public void validateuserName()
       {
    	   String expecteduserid="ELR321";
    	   String actualuserid=userid.getText();
    	   
    	   if(actualuserid.equals(expecteduserid))
    	      {
    	    	  System.out.println("userid matching TC is passed");
    	      }
    	      else{
    	    	System.out.println("userid is not matching TC is passed");  
    	      }
    	   
    	   
    	   
       }
       public void logoutButton() throws InterruptedException
       {
    	   userid.click();
    	   Thread.sleep(1000);
    	   logoutbutton.click();
    	   
       }
     
       
       
		

	}


