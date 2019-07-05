package com.capgemini.automation.stepdefs;

import com.capgemini.automation.config.TestConfiguration;
import cucumber.api.java.*;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class,
        classes = TestConfiguration.class)
public class HooksAndContextLoader extends BaseStepDefs {
    @Before("init")
    public void loadContext() {
    }

}
