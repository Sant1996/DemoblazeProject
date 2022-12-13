package com.genericUtils.demoblaze;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.objectrepo.demoblaze.HomePage;


public class Base {

//	public WebDriver driver;
	public static WebDriver driver;
	public FileLib fl=new FileLib();
	public CommonUtils cu=new CommonUtils();
	public HomePage hp;
	public static String productName;
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

//	@Parameters("browser")
	@BeforeClass
	public void beforeSuite() throws IOException
	{
         report=new ExtentReports();
         spark=new ExtentSparkReporter("test-output/extentreport.html");
         report.attachReporter(spark);
		if(fl.getPropetyData("browser").equals("chrome"))
    //      if(bn.equals("chrome"))
		{
			driver=new ChromeDriver();
		}

		if(fl.getPropetyData("browser").equals("edge"))
    //     if(bn.equals("edge"))
		{
			driver=new EdgeDriver();
		}

		driver.get(fl.getPropetyData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Launched the Browser",true);
	}

   @DataProvider
   public Object[][] contactTest() throws Throwable
   {
	   return fl.getDataFromExcel("Contact");
   }
	
	@BeforeMethod
	public void loginApp() throws IOException, InterruptedException
	{
		hp=PageFactory.initElements(driver, HomePage.class);
		hp.getLogin().click();
		hp.getUserNameTxt().sendKeys(fl.getPropetyData("username"));
		Thread.sleep(1000);
		hp.getPwdTxt().sendKeys(fl.getPropetyData("password"));
		hp.getLoginButton().click();
		cu.waitForElementToBePresent(driver, hp.getNameOfUserText());
		System.out.println(hp.getNameOfUserText().getText());
		boolean text = (hp.getNameOfUserText()).getText().contains(fl.getPropetyData("username"));
		Assert.assertTrue(text);
		Reporter.log("Logged in to the app", true);
	}

	@AfterMethod
	public void logutApp()
	{
		hp.getLogOutButton().click();
		Assert.assertTrue(hp.getLogin().isDisplayed());
		Reporter.log("Logged out from the app", true);
	}


	@AfterClass
	public void afterSuit()
	{
		driver.quit();
		report.flush();
	}

}
