package excelOperations;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		GetData gd = new GetData();
		
		String path = "Data/testdata.xlsx";
		String sheetname = "Sheet1";
		int rowno = 1;
		int  cellno = 1;

		String cellValue = gd.returnExcelData(path, sheetname, rowno, cellno);
		System.out.println(cellValue);
	}

}
