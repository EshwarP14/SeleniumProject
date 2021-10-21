package cucumberBasics;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/cucumberFeatures"},
glue = {"cucumberSteps"},
monochrome=true ,
plugin = {"pretty","html:target/cucumber"})

public class CarSearchRunCuke {
	
	
	

}
