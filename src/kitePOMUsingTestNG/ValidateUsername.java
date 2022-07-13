package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUsername {
	WebDriver driver;
	Sheet mysheet ;
	KteLogin login;
	Pinpage1 Pinpage1;
	HomePage HomePage;
	
	
	
  @BeforeClass 
  public void launchBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
	  ChromeOptions opt=new  ChromeOptions();
	  
	 // opt.addArguments("--headless");
	 // opt.addArguments("--disable-notifications");
	  opt.addArguments("incognito");
	  
	  
	  
      driver = new ChromeDriver(opt);
     driver.get("https://kite.zerodha.com/");
    
     Reporter.log("launching browser",true);
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     
	  File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 
		 login=new KteLogin(driver);
		 Pinpage1=new Pinpage1(driver);
		 HomePage=new HomePage(driver);
		 
		 }
  @BeforeMethod
  public void LoginToKiteApp() {
	  
		String username  = mysheet.getRow(5).getCell(0).getStringCellValue();
		String passsword  = mysheet.getRow(5).getCell(1).getStringCellValue();
		String EXPUID = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		login.senduserName(username);
		Reporter.log("sending username",true);
		login.sendpassword(passsword);
		Reporter.log("sending password",true);
		login.clickonloginButton();
		Reporter.log("click on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
		Pinpage1.sendpin(EXPUID);
		Reporter.log("sending pin",true);
		Pinpage1.continuebutton();
		Reporter.log("click on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserName()
  {
	  String expecteduserid=mysheet.getRow(5).getCell(0).getStringCellValue();
	  String actualuserid=HomePage.getactualuserid();
	  Reporter.log("validate username",true);
	  Assert.assertEquals(actualuserid, expecteduserid,"actual and expected username are not matching TC passed");
	  Reporter.log("actual and expected username are matching TC passed",true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  HomePage.logoutButton();
	  Reporter.log("logging out",true);
	  
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("closing browser",true);
	  driver.close();
	  
 
  
		
		
		
		

		
  }
}
