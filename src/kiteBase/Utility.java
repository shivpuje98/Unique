package kiteBase;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		 File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
	       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	       String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	       return value;
		 
	}

	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest= new File("D:\\JAVA\\myScreenshot\\myScreenshot1"+TCID+".png");
      FileHandler.copy(src, dest);
}
	

}
