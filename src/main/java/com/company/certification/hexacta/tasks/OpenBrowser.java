package com.company.certification.hexacta.tasks;

import com.company.certification.hexacta.exceptions.HexactaException;
import com.company.certification.hexacta.util.properties.HexactaProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {


    public static Performable thePageSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            String url = HexactaProperties.getUrlFront();
            actor.attemptsTo(Open.url(url));
        } catch (Exception e) {
            throw new HexactaException(e);
        }
    }
}
