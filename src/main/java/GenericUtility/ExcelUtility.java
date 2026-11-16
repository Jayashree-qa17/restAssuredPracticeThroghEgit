package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getSingleCellDataFromExcelFile(String sheetName, int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis=new FileInputStream("./testData/RestAssuredDDT.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 //Method chaining
		 Cell c = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		 DataFormatter df=new DataFormatter();
		 String value=df.formatCellValue(c);
		 wb.close();
		 return value; 
	 }
	
	public int getrowCount(String sheetName) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis=new FileInputStream("./testData/RestAssuredDDT.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 int rowCount=wb.getSheet(sheetName).getLastRowNum();
		 return rowCount;
	}
	
	 
}
