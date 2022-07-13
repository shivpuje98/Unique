package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UID = mysheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
		
		WebElement userID = driver.findElement(By.id("userid"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        
        
        userID.sendKeys(UID);
        password.sendKeys(PWD);
        login .click();
        Thread.sleep(2000); 
        
      WebElement pin = driver.findElement(By.id("pin"));
      WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']")); 
      
      pin.sendKeys(PIN);
      continueButton.click();
      Thread.sleep(2000); 
      
      
      WebElement usrNme = driver.findElement(By.xpath("//span[@class='user-id']"));
      String actualuserID = usrNme.getText();
      String expecteduserID=UID;
      
      if(actualuserID.equals(expecteduserID))
      {
    	  System.out.println("user ID matching TC is passed");
      }
      else{
    	System.out.println("user ID is not matching TC is passed");  
      }
      usrNme.click();
      Thread.sleep(100); 
      
      driver.findElement(By.xpath("//a[@target='_self']")).click();
      Thread.sleep(3000);
      driver.close();
      
		
	}

}
