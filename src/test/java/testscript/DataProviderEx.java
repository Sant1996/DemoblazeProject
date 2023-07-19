package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {


	     @Test(dataProvider = "getDatas")
	     public void employeeDetails(String name,String company,String role,String Id)
	     {
	    	 System.out.println(name+"  "+company+"  "+role+"  "+Id);
	     }
	    
		@DataProvider
		public Object[][] getDatas() throws EncryptedDocumentException, IOException
		{
			return getExcelDat("TestData/DetailsExcel.xlsx","Employee");
		}
		
		public String[][] getExcelDat(String path,String sh) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sh);
			int rows = sheet.getLastRowNum()+1;
			int cells = sheet.getRow(0).getLastCellNum();
			String arr[][] =new String[rows][cells];
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cells;j++)
				{
					arr[i][j]=sheet.getRow(i).getCell(j).toString();
				}
			}
			return arr;
			

	}

}
