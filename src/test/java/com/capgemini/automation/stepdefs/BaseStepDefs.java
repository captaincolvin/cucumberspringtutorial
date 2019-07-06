package com.capgemini.automation.stepdefs;

import com.capgemini.automation.screens.LandingScreen;
import com.capgemini.automation.screens.ResultsScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseStepDefs {

    @Autowired
    public String urlSitename;

    @Autowired
    public LandingScreen landingScreen;

    @Autowired
    public ResultsScreen resultsScreen;
}
