package excelsheetreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Pooja\\Selenium\\ExcelSele.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int totalrows=mysheet.getLastRowNum();
		int rowcount=totalrows;
		System.out.println("total rows are :"+rowcount );
		
		//count cell
		short cellcount=mysheet.getRow(rowcount).getLastCellNum();
		int totalcell=cellcount-1;
		System.out.println("Total cell are :"+totalcell);
		System.out.println("====================");
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=totalcell;j++)
			{
				Cell value=mysheet.getRow(i).getCell(j);
				CellType datatype = value.getCellType();
				
				if(datatype==CellType.STRING)
				{
					String strvalue = value.getStringCellValue();
					System.out.println(strvalue+" ");
				}
				else if(datatype==CellType.NUMERIC)
				{
				double strvalue = value.getNumericCellValue();
					System.out.println(strvalue+" ");
				
			}
				else if(datatype==CellType.BLANK)
				{
				
					System.out.println(" ");
				}
			}
		}
	}}
					


