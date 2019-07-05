package com.capgemini.automation.stepdefs;

import cucumber.api.java.en.*;

public class MyStepdefs extends BaseStepDefs {
    @Given("google chrome is launched")
    public void launchGoogleChrome(){
        landingScreen.launchChrome(urlSitename);
    }

    @When("the user searches for {string}")
    public void theUserSearchesFor(String searchKey) {
        landingScreen.search(searchKey);
    }

    @Then("the website should display {string}")
    public void theWebsiteShouldDisplay(String validationKey) {
        System.out.println(validationKey);
    }
}
