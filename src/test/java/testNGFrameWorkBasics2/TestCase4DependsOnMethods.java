package testNGFrameWorkBasics2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4DependsOnMethods {
	
	@Test(priority =1)
	public void doLogin()
	{
		System.out.println("Execution Login Test Case");
		Assert.fail("TEst Case fail due to conditions not met");
	
	}
	@Test(priority=2, dependsOnMethods="doLogin")
	public void doUserReg()
	{
		System.out.println("Executing User Reg TEst Case");
	}
	
	@Test(dependsOnMethods="doLogin")
	public void firstTestCase()
	{
		System.out.println("Executing first test case");
	}
}
