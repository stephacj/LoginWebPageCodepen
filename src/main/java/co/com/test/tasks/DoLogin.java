package co.com.test.tasks;

import co.com.test.userinterface.LoginFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
                Click.on(LoginFormPage.LOG_IN_BUTTON),
                Enter.theValue(username).into(LoginFormPage.USERNAME_OR_EMAIL_FIELD),
                Enter.theValue(password).into(LoginFormPage.PASSWORD_FIELD),
                Click.on(LoginFormPage.LOGIN_BUTTON)
                );



    }
}

