package RunnerAddToCart;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"src/test/java/AddToCartFeature/AddToCart.feature"},
		
		glue = {"Steps"},
		
		dryRun = !true,
		
		snippets = SnippetType.CAMELCASE
		)


public class Runner_AddToCart_Class extends AbstractTestNGCucumberTests {

}
