package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.userinterface.LoginFormPage.*;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public static DoLogin withCredentials (String username, String password) {
        return Tasks.instrumented(DoLogin.class, username, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USERNAME_OR_EMAIL_FIELD),
                Enter.theValue(username).into(USERNAME_OR_EMAIL_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
                );



    }
}

