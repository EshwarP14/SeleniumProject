package testNGFrameWorkBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Initilizing Everything !!!");
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Quitting Everything !!!");
	}

}
