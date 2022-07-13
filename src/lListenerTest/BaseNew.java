package lListenerTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import kiteBase.Utility;
import kitePOMUsingTestNG.HomePage;
import kitePOMUsingTestNG.KteLogin;
import kitePOMUsingTestNG.Pinpage1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class BaseNew 
{
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
		public static void captureScreenshot(String TCID) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File("D:\\JAVA\\myScreenshot\\myScreenshot2pvr"+TCID+".png");
		    FileHandler.copy(src, dest);
	}
		
	}


