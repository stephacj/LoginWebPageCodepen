package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.codepen.io")
public class LoginFormPage extends PageObject {

    public static final Target LOG_IN_BUTTON = Target.the("Button for doing log in").located(By.id("login-button"));
    public static final Target USERNAME_OR_EMAIL_FIELD = Target.the("Field for entering the username or email").located(By.id("login-email-field"));
    public static final Target PASSWORD_FIELD = Target.the("Field for entering the username or email").located(By.id("login-password-field_"));
    public static final Target LOGIN_BUTTON = Target.the("Button for entering to the page after validate the credentials").located(By.id("log-in-button"));




}
