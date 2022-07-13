package kiteBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kitePOMUsingTestNG.HomePage;
import kitePOMUsingTestNG.KteLogin;
import kitePOMUsingTestNG.Pinpage1;

public class ValidateKiteUserID extends Base {
	KteLogin login;
	Pinpage1 Pinpage1;
	HomePage HomePage;
	String TCID= "1234";
	
  @BeforeClass
  public void launchBrowser()  
  {
	  openBrowser();
	  login=new KteLogin(driver);
	  Pinpage1=new Pinpage1(driver);
	  HomePage=new HomePage(driver);
		 
	  
  }
  @BeforeMethod 
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.senduserName(Utility.readDataFromExcel(5, 0));
		Reporter.log("sending username",true);
		login.sendpassword(Utility.readDataFromExcel(5, 1));
		Reporter.log("sending password",true);
		login.clickonloginButton();
		Reporter.log("click on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
		Pinpage1.sendpin(Utility.readDataFromExcel(5, 2));
		Reporter.log("sending pin",true);
		Pinpage1.continuebutton();
		Reporter.log("click on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException
  {
	Assert.assertEquals( HomePage.getactualuserid(),Utility.readDataFromExcel(5, 0),"Actual and Expected are not matching TC is failed");
	                        Utility.captureScreenshot(driver, TCID);
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  HomePage.logoutButton(); 
  }
  @AfterClass
  public void closeBrowser()
  {
	driver.close();  
  }
}
