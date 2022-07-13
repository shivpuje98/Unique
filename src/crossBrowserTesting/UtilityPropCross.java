package crossBrowserTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityPropCross 
{
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\Sachin\\eclipse-workspace\\Java Tutorial Selenium\\myProperties.properties");
		prop.load(myfile);
		String value=prop.getProperty(key);
		return value;
		
	}
	

}
