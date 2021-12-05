package com.company.certification.hexacta.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.company.certification.hexacta.model.DataTest.obtain;

public class VerifyExpectedResultAlternate implements Question<Boolean> {

  public static VerifyExpectedResultAlternate inAplication() {
    return new VerifyExpectedResultAlternate();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyCurrentUrl = false;
      boolean verifyExpectedResult = false;
      String currentUrl = "";
      String urlDestiny = obtain("currentUrl");
      String expectedData = obtain("expectedResult");
      String expectedFront = "";
      verifyCurrentUrl = currentUrl.equals(urlDestiny);
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyCurrentUrl && verifyExpectedResult;
  }

}
