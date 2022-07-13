package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 @FindBy(xpath="//span[@class='user-id']")private WebElement userid;
     @FindBy(xpath="//a[@target='_self']")private WebElement logoutbutton;
     
     
     public HomePage(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
		}
     
     public void validateuserName(String EXPUID)
     {
  	   String expecteduserid=EXPUID;
  	   String actualuserid=userid.getText();
  	   
  	   if(actualuserid.equals(expecteduserid))
  	      {
  	    	  System.out.println("userid matching TC is passed");
  	      }
  	      else{
  	    	System.out.println("userid is not matching TC is passed"); 
  	      }
     }
     
     public String getactualuserid()
     {
    	 String actualuserid=userid.getText();
    	 return actualuserid;
     }
     public void logoutButton() throws InterruptedException
     {
  	   userid.click();
  	   Thread.sleep(1000);
  	   logoutbutton.click();
     }
  	   
  	    	
  	    	
  	    	
  	    	


}
