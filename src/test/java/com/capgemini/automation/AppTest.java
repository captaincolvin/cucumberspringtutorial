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
        features = {"classpath:features/"}

)
public class AppTest {

}
