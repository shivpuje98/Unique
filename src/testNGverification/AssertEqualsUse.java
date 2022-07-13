package testNGverification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void Mymethod() {
	  String a="city";
	  String b="city1";
	  
//	  Assert.assertEquals(a, b,"a and b values are not equal TC failed");
//	  Reporter.log("a and b values are equal TC passed",true);
	  
	  Assert.assertNotEquals(a, b,"a and b values are not equal TC passes");
	  Reporter.log("a and b values are equal TC fails",true);
	  
	  
	  
	  
	  
	  
  }
}
