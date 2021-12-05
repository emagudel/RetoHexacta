package com.company.certification.hexacta.tasks;


import com.company.certification.hexacta.interactions.Selection;
import com.company.certification.hexacta.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.hexacta.userinterface.History_01Page.BUTTON_BLOG;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_BLOG, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_BLOG)
        );
        actor.attemptsTo(Selection.inAplication());
        actor.attemptsTo(Wait.aTime(5000));
    }

    public static Search inTheAplication() {
        return instrumented(Search.class);
    }
}
