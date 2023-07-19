package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateMultipleProjectWithDiffData {
	
	@Test(dataProvider = "getData")
	public void createProject(String createdBy, String projectName, String status, int teamSize)
	{
		
	System.out.println(createdBy+"--"+projectName+"--"+status+"--"+teamSize);
		
		
	}
	
	
	@DataProvider(name="getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Chaitra";
		data[0][1] = "Dell";
		data[0][2] = "Completed";
		data[0][3] = 12;
		
		data[1][0] = "Vijay";
		data[1][1] = "HP";
		data[1][2] = "Created";
		data[1][3] = 15;
		
		data[2][0] = "Pavan";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 20;
		
		
		return data;
	}
}