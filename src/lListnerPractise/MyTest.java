package lListnerPractise;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void MyMethod1()
  {
	Reporter.log("Hi I am MyMethod1",true);  
  }
  @Test
  public void MyMethod2()
  {
	  Reporter.log("Hi I am MyMethod2",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods= {"MyMethod2"})
  public void MyMethod3()
  {
	  Reporter.log("Hi I am MyMethod3",true);   
  }
}
