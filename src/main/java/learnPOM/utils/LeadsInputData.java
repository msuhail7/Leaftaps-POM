package learnPOM.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeadsInputData {
	public String[][] readXL(String XLfilename) throws IOException {	
		
		XSSFWorkbook xlbook = new XSSFWorkbook("./data/"+XLfilename);
		XSSFSheet sheet1 = xlbook.getSheetAt(0);	
		int rows = sheet1.getLastRowNum();
		short cols = sheet1.getRow(0).getLastCellNum();
		String[][] data = new String[rows][cols];
		
		for (int j = 1; j <=rows; j++) {
			XSSFRow row = sheet1.getRow(j);
			for (int i = 0; i < cols; i++) {	
				XSSFCell cell = row.getCell(i);
				String cellvalue = cell.getStringCellValue();
				data[j-1][i]=cellvalue;
				System.out.print(cellvalue+":");
			} 
			System.out.println();			
		}			
		return data;
	}
}