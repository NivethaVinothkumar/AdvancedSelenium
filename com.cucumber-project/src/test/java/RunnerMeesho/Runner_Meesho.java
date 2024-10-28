package RunnerMeesho;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"src/test/java/MeeshoFeature/Meesho.feature"},
		
		glue = {"StepsMeesho"},
		
		dryRun = !true,
		
		snippets = SnippetType.CAMELCASE,
		
		plugin = {"pretty","html:reports","json:reports/result.json"}
		)

public class Runner_Meesho extends AbstractTestNGCucumberTests{

}
