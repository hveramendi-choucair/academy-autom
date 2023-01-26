package co.com.choucair.certification.academy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target CATEGORIA = Target.the("main category to search courses")
            .located(By.xpath("//div[@id='universidad']//Strong"));
    public static final Target SEARCH = Target.the("where do we write the search term")
            .located(By.id("coursesearchbox"));
    public static final Target BTN_SEARCH = Target.the("to confirm the search")
            .located(By.xpath("//button[contains(text(), 'Ir')]"));
    public static final Target SELECT_COURSE = Target.the("search result")
            .located(By.xpath("//div[@class='page-header-headings']//h1[contains(text(), 'Búsqueda global')]"));
}