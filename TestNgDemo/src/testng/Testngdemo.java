package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@Test
	public void demo()
	{
		System.out.println("Test NG Demo");
	}
	
	@BeforeTest
	public void BeforeT()
	{
		System.out.println("BEFORE TEST");
	}
	
	@AfterTest
	public void Aftert()
	{
		System.out.println("AFTER TEST");
	}
	
	
	@BeforeSuite
	public void BeforeS()
	{
		System.out.println("BEFORE SUITE");
	}
	
	@AfterSuite
	public void AfterS()
	{
		System.out.println("AFTER SUITE");
	}
	
	
	@BeforeClass
	public void BC()
	{
		System.out.println("BEFORE Class");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("AFTER Class");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("BEFORE METHOD");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("AFTER METHOD");
	}
	
	@Test
	public void Addcust()
	{
		System.out.println("Add Details");
	}

	@Test
	public void Editcust()
	{
		System.out.println("Edit Customer Details");
	}
	
	@Test(priority=1)
	public void Deletecust()
	{
		System.out.println("Delete Customer");
	}
	
}
