package cucumberSteps;

import io.cucumber.java.en.Then;

public class LoginProdStep {
	
	@Then("^user validates the capcha image$")
	public void user_validates_the_capcha_image() throws Throwable{
	    
		System.out.println("Validate capcha image");
	}
}
