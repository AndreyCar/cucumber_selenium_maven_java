package com.luxequality.cucumber_selenium_maven_java.steps;

import com.luxequality.cucumber_selenium_maven_java.helper.Hooks;

import io.cucumber.java.en.When;

public class CommonSteps extends Hooks {
    @When("user refresh page")
    public static void userRefreshPage() {
        driver.navigate().refresh();
    }
}
