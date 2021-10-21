package cucumberBasics;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/cucumberFeatures"},
	glue = {"cucumberSteps"},
	monochrome=true ,
	plugin = {"pretty","html:target/cucumber"} ,
	tags= "@bvt" )
public class BankLoginRunCuke extends AbstractTestNGCucumberTests{

}
