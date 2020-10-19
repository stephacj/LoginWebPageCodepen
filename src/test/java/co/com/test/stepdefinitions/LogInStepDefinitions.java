package co.com.test.stepdefinitions;

import co.com.test.tasks.DoLogin;
import co.com.test.tasks.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LogInStepDefinitions {

    String name;

    @Before
    public void InitialConfiguration(){
        setTheStage(new OnlineCast()); //it indicates to Serenity that can use driver defined in serenity.properties

    }

    @Given("(.*) has an active account$")
    public void stephanie_has_an_active_account(String name) {
        theActorCalled(name).wasAbleTo(OpenPage.theWebPageCodepen());

    }

    @When("^she sends their valid credentials$")
    public void she_sends_their_valid_credentials() {

        theActorCalled(name).attemptsTo(
                DoLogin.withCredentials("stephacj", "stephacj32")
        );
    }

    @Then("^she should have access to her account$")
    public void she_should_have_access_to_her_account()  {
    }



}
