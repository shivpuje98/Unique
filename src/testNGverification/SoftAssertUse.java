package testNGverification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void MyMethod() {
	  String a="abc";
	  String b="abc1";
	  
	  //to use soft assert we need to create object of softAssert class
	  
	  SoftAssert soft =new SoftAssert();
	  soft.assertNotEquals(a,b," both are equal TC is failed");
	  soft.assertNull(b,"values is not null,TC is failed");
	  soft.assertAll();
  }
  @Test
  
  public void testing()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  SoftAssert s =new SoftAssert();
	  s.assertTrue(b,"value is false TC is failed");
	  s.assertFalse(a,"value is true TC is failed");
	  
  }
  
  
}
