package runnersprintmodule;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="features",
glue="StepDefinitionsprintmodule",

plugin={
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber.html"},
		
//"pretty","json:target/cucumberReports.json"},
//"pretty","junit:target/cucumberReports.xml"},
dryRun=true
)
//extends AbstractTestNGCucumberTests
public class modulerunner extends AbstractTestNGCucumberTests {
}
