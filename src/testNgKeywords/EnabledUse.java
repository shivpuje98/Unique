package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
	 @Test
	  public void s()
	{
	   Reporter.log("s is running",true);
	}
	  @Test
	  public void h()
	  {
		  Reporter.log("h is running",true) ; 
	  }
	  @Test(enabled=false)
	  public void i()
	  {
		  Reporter.log("i is running",true);
	  }
	  @Test
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
		  
 
  }

