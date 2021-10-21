package testNGFrameWorkBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing the Browser");
	}
	
	@Test
	public void firstTest()
	{
		System.out.println("Execute first Test");
	}
	
	@BeforeTest
	public void openingDBConn()
	{
		System.out.println("Opening DB Conn");
	}
	@AfterTest
	public void closingDbConn()
	{
		System.out.println("closing DB conn");
		
	}
	@Test(priority=1)
	public void doLogin()
	{
		
		System.out.println("Executing Login Test Case");
	}
	
	@Test(priority=2)
	public void doUserReg()
	{
		System.out.println("Executing User Reg Test Case");
	}
	
	

}
