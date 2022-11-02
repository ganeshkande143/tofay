package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic 

{
	@BeforeSuite
	public void openbroser()
	{
		System.out.println("open browser");
	}
	
	@BeforeTest
	public void url()
	{
		System.out.println("enter url");
	}
	
	@BeforeClass
	public void maximize()
	{
		System.out.println("max browser");
	}
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("gt cookies");
	}
	
	@Test
	public void BusinessLogic()
	{
		System.out.println("BL");
		
	}
	
	@AfterMethod
	public void takescreenshot()
	{
		System.out.println("Take screenshot");
	}
	
	@AfterClass
	public void dltcookies()
	{
		System.out.println("dlt cookies");
	}
	
	@AfterTest
	public void dbconnectionclosed()
	{
		System.out.println("dbconnection");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("CloseBrowser");
	}
	

}
