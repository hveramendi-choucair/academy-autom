package co.com.choucair.certification.academy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target USER_NAME = Target.the("field to fill in the username")
            .located(By.id("username"));
    public static final Target PASSWORD = Target.the("field to fill in the password")
            .located(By.id("password"));
    public static final Target BTN_ACCEDER = Target.the("button to confirm login")
            .located(By.xpath("//div[@class='sign-up-btn text-center']//button[contains(text(), 'Acceder')]"));
}
