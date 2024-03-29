package com.company.certification.hexacta.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/history_01.feature",
        glue = { "com.company.certification.hexacta.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class History_01TestRunner {}
