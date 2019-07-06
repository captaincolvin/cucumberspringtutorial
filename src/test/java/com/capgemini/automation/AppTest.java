package com.capgemini.automation;

import static org.junit.Assert.assertTrue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.capgemini.automation.stepdefs"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        features = {"classpath:features/Scenario.feature"}

)
public class AppTest {

}
