package com.persy.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelConfig {

	
	private static String data = null;
	private static FileInputStream input;
	private static  XSSFWorkbook wb = null;
	private static XSSFSheet sheet1 = null;
	
	public static String ReadExcel()
	{
		
		File file1 = new File("D:\\eclipse-jee-kepler-R-win32-x86_64\\WordPressDemoSite\\src\\TestData\\WordpressData.xlsx");
		
		try {
			 input = new FileInputStream(file1);
				wb = new XSSFWorkbook(input);
				sheet1 = wb.getSheet("LoginData");
				int rowcount = sheet1.getLastRowNum()+1;
				
				for(int i=0;i<rowcount;i++)
				{
					int cellcount = sheet1.getRow(i).getLastCellNum();
					for(int j =0; j<cellcount;j++)
					{
						data = sheet1.getRow(i).getCell(j).getStringCellValue();
					System.out.println("  the excel data is " +data.toString());
					}
				}
				
				 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return data;
	
	}	
		

	

 
  

}
