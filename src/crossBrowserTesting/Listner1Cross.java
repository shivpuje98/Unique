package crossBrowserTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner1Cross extends BaseNewCross implements ITestListener{
	BaseNewCross b=new BaseNewCross();
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("Take Screenshot"+ result.getName(),true);	
	
		String TCID = result.getName();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\JAVA\\myScreenshot\\myScreenshot2Pooja"+TCID+".png");
	    try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
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
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}

}
