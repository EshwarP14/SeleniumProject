package testNGFrameWorkBasics;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseClass{
	@Test
	public void isSkip()
	{
		if(true)
			throw new SkipException("Skipping the test case as the condition not met");
	}

}
