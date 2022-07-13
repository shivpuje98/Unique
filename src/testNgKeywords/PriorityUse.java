package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=1)
  public void s()
{
   Reporter.log("s is running",true);
}
  @Test(priority=2)
  public void h()
  {
	  Reporter.log("h is running",true) ; 
  }
  @Test(priority=3)
  public void i()
  {
	  Reporter.log("i is running",true);
  }
  @Test(priority=4)
  public void v()
  {
	  Reporter.log("v is running",true);
  }
	  
  
}
