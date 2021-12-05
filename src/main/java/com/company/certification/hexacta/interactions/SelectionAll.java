package com.company.certification.hexacta.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static com.company.certification.hexacta.userinterface.History_01Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionAll implements Interaction {

    private static final Logger LOGGER = LogManager.getLogger(SelectionAll.class.getName());


    public static SelectionAll inAplication() {
        return instrumented(SelectionAll.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listPagination = SELECTION_ITEM.resolveAllFor(actor);
        for (int i = 0; i < listPagination.size()-1; i++) {
            List<WebElementFacade> listTitles = ALL_TITLES.resolveAllFor(actor);
            List<WebElementFacade> listTitlesLink = ALL_TITLES_LINK.resolveAllFor(actor);
            for (int j = 0; j < listTitles.size(); j++) {
                LOGGER.info("TITLE: " + listTitles.get(j).getText()
                        + " - LINK: " + listTitlesLink.get(j).getAttribute("href"));
            }
            SELECTION_ITEM.resolveAllFor(actor).get(i + 1).click();
            actor.attemptsTo(Wait.aTime(2000));
        }
    }
}
