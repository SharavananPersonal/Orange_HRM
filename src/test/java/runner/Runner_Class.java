package runner;

import org.junit.runner.RunWith;

import base_Package.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\workspace\\Cucumber_Arul_Prasath_1\\src\\main\\java\\feature\\orange_login.feature", glue="step_defenition")
public class Runner_Class extends Driver{
	
	


}
