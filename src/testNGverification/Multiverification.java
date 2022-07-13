package testNGverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiverification {
  @Test
  public void Mymethod() {
	  
	  String a="pune";
	  String b="pune1";
	  
	  Assert.assertNotEquals(a,b,"TC is failed values are equal");
	  Assert.assertNotNull(b,"TC is failed value is null");
  }
}