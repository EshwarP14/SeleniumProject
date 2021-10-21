package cucumberSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CarSearchStep {
	
	
	public static WebDriver driver;
	
		
	@Given("^i am on homepage https://www.carsguide.com.au/ for carsguide.com$")
	public void i_am_on_homepage_https_www_carsguide_com_au_for_carsguide_com() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.carsguide.com.au/");
		
	    
	}

	@When("^i move to carsale menu$")
	public void i_move_to_carsale_menu() throws Throwable{
	   
	}

	@Then("^click on make dropdown and select BMW$")
	public void click_on_make_dropdown_and_select_bmw()throws Throwable {
		
		driver.findElement(By.id("makes")).sendKeys("BMW");
	    
	}

	@Then("^Click on model and 1Series$")
	public void click_on_model_and_1series() throws Throwable{
		
		driver.findElement(By.id("models")).sendKeys("1 Series");
	    
	}

	@Then("^Click on Search button$")
	public void click_on_search_button()throws Throwable {
		
		driver.findElement(By.id("search-submit")).click();
	    
	}

	@Then("^Verify BMW related cars are displaying$")
	public void verify_bmw_related_cars_are_displaying()throws Throwable {
	    
	}

}
