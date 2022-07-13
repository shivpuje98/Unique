package lListnerPractise;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("Take Screenshot",true);	
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test passed successful",true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("This test is skipped",true);	
	}
	

}
