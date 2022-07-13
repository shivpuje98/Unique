package testNgKeywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class InvocationCount {
  @Test(invocationCount=3)
  public void myTest() 
  {
	  Reporter.log("hello",true);
  }
  @BeforeMethod
  public void test1()
{
	  Reporter.log("hi",true);  
  }

  @AfterMethod
  public void test2() 
  {
	  Reporter.log("no",true);
  }

  @BeforeClass
  public void test3()
{
	  Reporter.log("yes",true);
  }

}
