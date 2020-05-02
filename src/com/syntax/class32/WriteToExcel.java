package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		
		//writing into existing sheet
		Sheet sheet=book.getSheet("sheet1");
		
		sheet.getRow(0).createCell(0).setCellValue("r0c0");
		
		sheet.createRow(0).createCell(1).setCellValue("r0c1");
		
		Sheet customSheet=book.createSheet("Sheet11");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		book.write(fos);
		
		
		

	}
}
