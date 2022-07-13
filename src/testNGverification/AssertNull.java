package testNGverification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
//  @Test
//  public void AssertNullUse(){
//	  
//	  String a=null;
//	  String b="abc";
//	  
//	  Assert.assertNull(b,"value is not null TC failed");
//	  Reporter.log("value is null TC is passed",true);
  //}
	  @Test
	  public void AssertNotNull() {
		  
		  String a= null;
		  String b="pvr";
		  
		  Assert.assertNotNull(b,"value  is  null TC failed");
		  Reporter.log("value is not  null TC is passed",true); 
		 // Assert.fail();
		  
	  }
	  
	  
			  
	  
	  
  }

