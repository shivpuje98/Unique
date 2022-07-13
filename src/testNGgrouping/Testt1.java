package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testt1 {
	 @Test
	  public void s()
	{
	   Reporter.log("s is running",true);
	}
	  @Test(groups= {"atul"})
	  public void h()
	  {
		  Reporter.log("h is running",true) ; 
	  }
	  @Test(groups= {"rohit"})
	  public void i()
	  {
		  Reporter.log("i is running",true);
	  }
	  @Test(groups= {"atul"})
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
		  

 


  }

