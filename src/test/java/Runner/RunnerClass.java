package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\FeatureFiles", glue= {"Steps","Hooks"}, monochrome=true, 
plugin = {"pretty","html:target/cucumber-reports/cucumber.html",	
		"json:target/cucumber-reports/cucumber.json"}, dryRun=false) 


public class RunnerClass {

}
