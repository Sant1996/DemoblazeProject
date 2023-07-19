package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsEx {
	
	@Test(priority = 1)
	public void test()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 2)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void bM()
	{
		System.out.println("BeforeMethod2");
	}
	
	@BeforeMethod
	public void bM1()
	{
		System.out.println("BeforeMethod1");
	}
	
	@AfterMethod
	public void aM()
	{
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void aC()
	{
		System.out.println("After class");
	}

}
