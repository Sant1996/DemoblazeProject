package com.genericUtils.demoblaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

public class EventList implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Base.test.fail("Test script has got failed ===>"+result.getThrowable().toString());
          TakesScreenshot t=((TakesScreenshot) Base.driver);
          File src=t.getScreenshotAs(OutputType.FILE);
          File dest=new File("./Screenshot/"+System.currentTimeMillis()+".png");
          String path=dest.getAbsolutePath();
          try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          Base.test.fail("Test Script failed "+result.getThrowable(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	}	
}
