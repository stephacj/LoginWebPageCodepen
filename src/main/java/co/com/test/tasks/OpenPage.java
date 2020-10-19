package co.com.test.tasks;

import co.com.test.userinterface.LoginFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenPage implements Task {

    private LoginFormPage loginFormPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.browserOn(loginFormPage));
         //  actor.attemptsTo(Open.url("https://www.codepen.io"));
    }

public static OpenPage theWebPageCodepen() {
    return Tasks.instrumented(OpenPage.class);
}
}
