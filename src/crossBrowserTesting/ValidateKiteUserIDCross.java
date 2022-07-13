package crossBrowserTesting;

import org.testng.annotations.Test;

import kiteBase.Base;
import kiteBase.Utility;
import kitePOMUsingTestNG.HomePage;
import kitePOMUsingTestNG.KteLogin;
import kitePOMUsingTestNG.Pinpage1;
import lListenerTest.BaseNew;
import propertiess.UtilityProp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
 

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(crossBrowserTesting.Listner1Cross.class)

public class ValidateKiteUserIDCross extends BaseNewCross {
	KteLogin login;
	Pinpage1 Pinpage1;
	HomePage HomePage;
	String TCID= "555";
	@Parameters("browserName")
  @BeforeClass
  public void launchBrowser( @Optional String name) throws IOException  
  {
//		 login=new KteLogin(driver);
//		  Pinpage1=new Pinpage1(driver);
//		  HomePage=new HomePage(driver);
//		
	  if(name.equals("firefox"))
	  {
		  openBrowserfirefox();
	  }
	  else if(name.equals("chrome"))
	  {
		  openBrowserchrome();
	  }
	  
	  login=new KteLogin(driver);
	  Pinpage1=new Pinpage1(driver);
	  HomePage=new HomePage(driver);
		 
	  
  }
  @BeforeMethod 
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.senduserName(UtilityProp.getDataFromPropertyFile("UN"));
		
		login.sendpassword(UtilityProp.getDataFromPropertyFile("PWD"));
		
		login.clickonloginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
		Pinpage1.sendpin(UtilityProp.getDataFromPropertyFile("PIN"));
		
		Pinpage1.continuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException
  {
	Assert.assertEquals( HomePage.getactualuserid(),UtilityProp.getDataFromPropertyFile("UN"));
	                        BaseNewCross.captureScreenshot(TCID);
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  HomePage.logoutButton(); 
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	 Thread.sleep(3000);
	driver.close(); 
	
  }
}
