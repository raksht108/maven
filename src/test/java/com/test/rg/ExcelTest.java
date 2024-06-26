package com.test.rg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		File excelfile=new File("./src/test/resources/RG.xlsx");
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount+" "+columncount);
		for (int i=1;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		workbook.close();
		fis.close();

	}

}
