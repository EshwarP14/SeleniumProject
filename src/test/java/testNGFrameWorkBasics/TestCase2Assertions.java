package testNGFrameWorkBasics;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2Assertions extends BaseClass {
	
	@Test
	public void validateTitles()
	{
		
		String ExpectedTitle = "Yahoo.com";
		String ActualTitle ="Google.com";
		
		Assert.assertEquals(ActualTitle,ExpectedTitle );
		Assert.assertTrue(false, "Element not found");
		Assert.fail("Test case failed as conditions not met");
	}
}
