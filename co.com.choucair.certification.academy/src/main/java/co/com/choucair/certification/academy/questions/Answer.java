package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterfaces.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    public String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.SELECT_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
