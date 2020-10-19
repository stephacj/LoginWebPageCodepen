package co.com.test.tasks;

import co.com.test.userinterface.LoginFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.test.userinterface.LoginFormPage.LOG_IN_BUTTON;


public class OpenUp implements Task {

    private LoginFormPage loginFormPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.browserOn(loginFormPage));
          //actor.attemptsTo(Open.url("https://www.codepen.io")); other option for calling the url
        Click.on(LOG_IN_BUTTON);
    }

public static Performable theWebPageCodepen() {
    return Tasks.instrumented(OpenUp.class);
}
}
