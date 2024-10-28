package RunnerLogin;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		
		features={"src/test/java/LoginFeature/Login.feature"},
		
		glue = "Steps",
		
		dryRun =!true,
		
		snippets=SnippetType.CAMELCASE,
		
		plugin = {"pretty","html:reports","json:report/result.json","junit:reports/result.xml"},
		
		tags={"@smoke"}
		
		)

public class Runner_Login_Class  extends AbstractTestNGCucumberTests
{

}
