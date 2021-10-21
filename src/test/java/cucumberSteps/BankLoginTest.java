package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.*;

public class BankLoginTest {
	
	@Given("^User Navigates to Bank Application$")
	public void user_navigates_to_bank_application() throws Throwable{
		
		System.out.println("user_navigates_to_bank_application" );
	    
	}

	@When("^Verifies the Bank Application Logo$")
	public void verifies_the_bank_application_logo() throws Throwable{
		System.out.println("verifies_the_bank_application_logo" );
	}

	@Then("^Enter [a-zA-Z]{1,} username$")
	public void enter_valid_username() throws Throwable{
		System.out.println("enter_the_username" );
	}

	@And("^Enter [a-zA-Z]{1,} password$")
	public void enter_valid_password() throws Throwable{
		System.out.println("enter_the_password" );
	}

	@Then("^User [a-zA-Z]{1,} logon to application$")
	public void user_should_logon_to_application() throws Throwable{
		System.out.println("user_should_logon_to_application" ); 
	}


}
