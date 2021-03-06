import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//


public class ExcelTestOne {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException{
		
		System.out.println("This is a sample output!");
			
		try{
			String excelFilePath = "Z:\\testExcel.xls";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	        Workbook workbook = WorkbookFactory.create(inputStream);
	        
	        Sheet sheet = workbook.getSheetAt(0);
	        Cell cell2Update = sheet.getRow(1).getCell(3);
	        cell2Update.setCellValue(500);
	        
	        
	        /*Object[][] bookData = {
                    {"The Passionate Programmer", "Chad Fowler", 16},
                    {"Software Craftmanship", "Pete McBreen", 26},
                    {"The Art of Agile Development", "James Shore", 32},
                    {"Continuous Delivery", "Jez Humble", 41},
            };
 
            int rowCount = sheet.getLastRowNum();
 
            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);
 
                int columnCount = 0;
                 
                Cell cell = row.createCell(columnCount);
                cell.setCellValue(rowCount);
                 
                for (Object field : aBook) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
 
            }*/
 
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
			
		} catch (IOException | EncryptedDocumentException
                | InvalidFormatException ex) {
            ex.printStackTrace();
        }
	
	}
	
}
