package testNgStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy1 {
  @Test
  public void rechargephone() 
  {
	  Reporter.log("Recharge done",true); 
  }
  @BeforeMethod
  public void logintoRechargePortal() 
  {
	  Reporter.log("Login success",true);   
  }

  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("Logout done",true); 
  }

  @BeforeClass
  public void launchbrowser()
  {
	  Reporter.log("Browser launched",true); 
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("Browser closed",true); 
  }

}
