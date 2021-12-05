package com.company.certification.hexacta.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static com.company.certification.hexacta.model.DataTest.obtain;
import static com.company.certification.hexacta.userinterface.History_01Page.TOPIC;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class VerifyExpectedResult implements Question<Boolean> {

  public static VerifyExpectedResult inAplication() {
    return new VerifyExpectedResult();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyCurrentUrl = false;
      boolean verifyExpectedResult = false;
      WebDriver driver = getDriver();
      String currentUrl = driver.getCurrentUrl();
      String urlDestiny = obtain("currentUrl");

      String expectedData = obtain("expectedResult");
      String expectedFront = TOPIC.of(obtain("expectedResult")).resolveFor(actor).getText().trim();

      verifyCurrentUrl = currentUrl.equals(urlDestiny);
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyCurrentUrl && verifyExpectedResult;
  }

}
