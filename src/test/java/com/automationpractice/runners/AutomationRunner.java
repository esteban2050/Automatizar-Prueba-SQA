package com.automationpractice.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * 
 * @author Juan Esteban Lopez Giraldo.
 *
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/main/resources/features/automationPractice.feature",
glue = "com.automationpractice.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class AutomationRunner {
}