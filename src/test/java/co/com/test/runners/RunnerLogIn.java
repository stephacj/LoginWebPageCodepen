package co.com.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_web_page.feature",
				  glue = "co.com.test.stepdefinitions",
				  snippets = SnippetType.CAMELCASE)
				  
public class RunnerLogIn {
	private RunnerLogIn(){
		throw new IllegalStateException("Utility class");
	}

}