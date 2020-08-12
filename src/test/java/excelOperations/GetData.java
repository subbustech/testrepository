package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	public static String returnExcelData(String path, String sheetname, int rowno, int cellno) throws IOException {

		//Create FileInputStream object
		FileInputStream fis = new FileInputStream(path);

		//Create an object for XSSFWorkbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Create an object for XSSFSheet
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		//Create a row object
		Row row = sheet.getRow(rowno);
		
		//Create cell object
		Cell cell = row.getCell(cellno);
		
		DataFormatter df = new DataFormatter();
		String cellvalue = df.formatCellValue(cell);
		
		workbook.close();
		
		return cellvalue;

//		Iterator<Row> itrows = sheet.iterator();
//		while(itrows.hasNext()) {
//			Row row = itrows.next();
//
//			//		//Create an object for row
//			//		Row row = sheet.getRow(3);
//
//			//Cell cell = row.getCell(1);
//			Iterator<Cell> it = row.iterator();
//
//			while(it.hasNext()) {
//				Cell cell = it.next();
//
//				//Get that cell value
//				DataFormatter df = new DataFormatter();
//				String cellvalue = df.formatCellValue(cell);
//				System.out.println(cellvalue);
//			}
//		}

	}
}
