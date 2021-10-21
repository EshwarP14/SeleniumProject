package cucumberSteps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginTest {
	
	@Before
	public void launchBrowser() {
		
		System.out.println("Launching the browser");
	}
	@After
	public void tearDown() {
		
		System.out.println("closing the browser");
	}
	
	@Given("user Navigates to facebook website")
	public void user_navigates_to_facebook_website() throws Throwable{
		System.out.println("User Navigate to Facebook website");

	}

	
	@When("user verifies facebook logo")
	public void user_verifies_facebook_logo() throws Throwable{
		System.out.println("Face book logo is displayed");
	}

	
	@Then("^user enters \"([^\"]*)\" username$")
	public void user_enters_username(String username) throws Throwable{
		System.out.println("Entered username "+username+"");
	}

	

	@And("^user enter \"([^\"]*)\" password$")
	public void user_enter_password(String password) throws Throwable{
		System.out.println("Enter password "+password+"");
	    
	}

	

	@Then("^user \"([^\"]*)\" login to facebook successfully$")
	public void user_login_to_facebook_successfully(String loginType) throws Throwable{
		System.out.println("Validate login success "+loginType+"");
	   
	}
	
	@Then("^user select the age and location$")
	public void user_select_the_age_and_location(DataTable table) throws Throwable{
		
		List<Map<String,String>> data = table.asMaps(String.class,String.class);
		System.out.println("User Select the age category:"+data.get(0).get("Age")+" ------Selected Location as : "+data.get(0).get("location"));
	    
	}

	/*
	
	----------------
	
	@Given(" user Navigates to facebook website")
	public void user_navigates_to_facebook_website() throws Throwable {

		System.out.println("User Navigate to Facebook website");

	}

	@When(" user verifies facebook logo")
	public void user_verifies_facebook_logo() throws Throwable {

		System.out.println("Face book logo is displayed");

	}

	@Then(" user enters \"([^\"]*)\" username")
	public void user_enters_valid_username(String username) throws Throwable {

		System.out.println("Entered username "+username+"");

	}

	@And(" user enter \"([^\"]*)\" password")
	public void user_enter_valid_password(String password) throws Throwable {

		System.out.println("Enter password "+password+"");

	}

	@Then(" user \"([^\"]*)\" login to facebook successfully")
	public void user_should_login_to_facebook_successfully(String ValidateLogin) {
		
		System.out.println("Validate login success "+ValidateLogin+"");
*/
	}


