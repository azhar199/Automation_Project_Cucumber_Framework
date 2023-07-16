package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\CSC\\Desktop\\Workspace_JAva\\Code_Panda_Project\\src\\test\\java\\Features",
		glue= {"StepDefination"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		dryRun = true,
		monochrome = true
		)
public class Test_Runner {

	
	
}
