package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void validateuserID ()
  {
	Reporter.log("user ID validated",true);  
  }
  @Test
  public void validateDashboard()
  {
	  Reporter.log("Dashboard validated",true); 
  }
  @BeforeMethod
  public void logintokiteApp () 
  {
	  Reporter.log("Login success",true);   
  }

  @AfterMethod
  public void launchbrowser()
  {
	  Reporter.log("browser launched",true);   
  }

  @BeforeClass
  public void logoutfromkiteapp()
  {
	  Reporter.log("logging out",true); 
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("close browser",true); 
  }

}
