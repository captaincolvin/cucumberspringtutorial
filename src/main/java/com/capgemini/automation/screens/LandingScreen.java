package com.capgemini.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingScreen extends BaseScreen {

    public LandingScreen(WebDriver webDriver) {
        super(webDriver);
    }

    public void search(String key){
        searchBar.sendKeys(key);
    }

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchBar;

    public void launchChrome(String url) {
        webDriver.get(url);
    }
}
