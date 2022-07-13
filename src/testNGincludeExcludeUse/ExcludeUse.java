package testNGincludeExcludeUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeUse {
	@Test
	  public void s()
	{
	   Reporter.log("s is running",true);
	}
	  @Test
	  public void h() throws InterruptedException
	  {
		  Reporter.log("h is running",true) ;  
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

