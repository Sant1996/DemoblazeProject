package com.genericUtils.demoblaze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropetyData(String data) throws IOException
	{
		FileInputStream fis=new FileInputStream("./TestData\\commonData.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(data);

	}

	public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./TestData\\DetailsExcel.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        DataFormatter format=new DataFormatter();
        return format.formatCellValue(wb.getSheet(sheet).getRow(row).getCell(cell));
	}
	
	public String[][] getDataFromExcel(String sheet) throws Throwable, IOException
	{
		FileInputStream in=new FileInputStream("TestData/DetailsExcel.xlsx");
		Workbook wb = WorkbookFactory.create(in);
		Sheet sh = wb.getSheet(sheet);
		int rows = sh.getLastRowNum();
		int cell = sh.getRow(0).getLastCellNum();
		System.out.println(rows+" "+cell);
		String arr[][]=new String [rows][cell];
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cell; j++) {
				arr[i][j]=sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}
}
