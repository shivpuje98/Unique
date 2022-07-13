package kitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kitePOM.KiteHomePage;
import kitePOM.KiteLoginPage;
import kitePOM.Pinpage;

public class Testclass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String username  = mysheet.getRow(5).getCell(0).getStringCellValue();
		String passsword  = mysheet.getRow(5).getCell(1).getStringCellValue();
		String EXPUID = mysheet.getRow(5).getCell(2).getStringCellValue();
		

		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        KteLogin klp=new KteLogin(driver);
        klp.senduserName(username);
        klp.sendpassword(passsword);
        klp.clickonloginButton();
        Thread.sleep(2000);
        
        Pinpage1 pp=new Pinpage1(driver);
        pp.sendpin(EXPUID);
        pp.continuebutton();
        Thread.sleep(2000);
        
       HomePage khp=new HomePage(driver);
        khp.validateuserName(username);
        khp.logoutButton();
   
       Thread.sleep(2000);
        driver.close();
		
	}

}
