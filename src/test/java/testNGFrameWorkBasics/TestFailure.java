package testNGFrameWorkBasics;

import org.testng.Assert;

public class TestFailure extends BaseClass {
	
	public void doLogin()
	{
		
		System.out.println("Failing the test case");
		Assert.fail("Capture SCreenshot");
	}

}
