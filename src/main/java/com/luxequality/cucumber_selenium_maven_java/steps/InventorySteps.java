package com.luxequality.cucumber_selenium_maven_java.steps;

import io.cucumber.java.en.Then;

public class InventorySteps extends CommonSteps {
    @Then("user should be redirected to the Inventory page")
    public void userRedirectedToInventoryPage() {
        waitForVisibility(inventoryPage.btnExtendSidebarMenu());
    }
}
