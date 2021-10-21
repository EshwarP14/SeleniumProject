package testNGFrameWorkBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3SoftAssertions extends BaseClass {
	
	@Test
	public void validateTitles()
	{
		String Expected_Title="Yahoo.com";
		String Actual_Title="Google.com";
		
		SoftAssert softassert = new SoftAssert();
		
		softassert.assertEquals(Actual_Title, Expected_Title);
		softassert.assertEquals(true, false ,"TEst case failed due to conditions not met");
		
		softassert.assertAll();
		
	}

}
