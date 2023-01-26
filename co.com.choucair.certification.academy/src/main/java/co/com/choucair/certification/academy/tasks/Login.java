package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterfaces.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("hveramendi").into(ChoucairLoginPage.USER_NAME),
                Enter.theValue("Proyecto2023#").into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.BTN_ACCEDER));
    }
}
