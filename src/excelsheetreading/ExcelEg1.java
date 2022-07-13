
package excelsheetreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
 String name1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
System.out.println(name1);
		
 String name2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
System.out.println(name2);
		
String name3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
System.out.println(name3);
			
String name4 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
System.out.println(name4);
			
String name5 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
 System.out.println(name5);
 System.out.println("===========");
 
 double name6 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
System.out.println(name6);

 boolean name7 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
System.out.println(name7);

Cell name8 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2);
System.out.println(name8);


	
	
	
			
			
			
			
	}

}
