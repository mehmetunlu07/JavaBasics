package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"\\configs\\test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		
		//get an Object of Workbook type
		Workbook book=new XSSFWorkbook(fis);   // file input stream
		Sheet sheet=book.getSheet("Sheet2");
		
		//need to find numbers or rows
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		//find number of columns
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		//get data from all rows and all columns
		for(int r=0; r<rows;r++) {//iterates over rows
			for(int c=0; c<cols; c++) {//iterates over cols
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+"  ");
			}
			System.out.println();
		}

	}

}
