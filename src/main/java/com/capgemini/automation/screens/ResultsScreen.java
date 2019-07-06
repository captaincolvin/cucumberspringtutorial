package com.capgemini.automation.screens;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsScreen extends BaseScreen {

    public ResultsScreen(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "(//span[contains(text(),'Pembroke Welsh Corgi')])[1]")
    private WebElement searchResult;

    public void compareResult(String key){
        Assert.assertTrue(searchResult.getText().contains(key));
    }

    public void closeBrowser(){
        webDriver.close();
    }
}
