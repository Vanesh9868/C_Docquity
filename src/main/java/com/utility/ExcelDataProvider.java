package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;

	public ExcelDataProvider () throws IOException
	{
		String path = "C:\\Users\\Hp\\eclipse-workspace\\C_docquity\\excel_TestData\\TestData.xlsx";
		FileInputStream fis = new FileInputStream (path);
		wb = new XSSFWorkbook (fis);
		
	}
	
	public String getSheetData (String sheetName , int row , int cell)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}

}
