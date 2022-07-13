package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
	 @Test
	  public void s()
	{
	   Reporter.log("s is running",true);
	}
	  @Test(timeOut=2000)
	  public void h() throws InterruptedException
	  {
		  Reporter.log("h is running",true) ;
		  Thread.sleep(1000);
		  
	  }
	  @Test()
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

