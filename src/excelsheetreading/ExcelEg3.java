package excelsheetreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		Workbook wbf = WorkbookFactory.create(myfile);
		Sheet mysheet = wbf.getSheet("Sheet1");
		//Row myrow = mysheet.getRow(1);
		//Cell mycell = myrow.getCell(2);
		//System.out.println(mycell.getCellType());
		System.out.println("================");
		
		for(int i=0;i<=2;i++)//for row
		{
			for(int j=0;j<=1;j++)
			{
				String text = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(text+ " ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
