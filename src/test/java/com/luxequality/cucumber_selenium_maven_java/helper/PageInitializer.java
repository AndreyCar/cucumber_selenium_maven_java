package com.luxequality.cucumber_selenium_maven_java.helper;

import com.luxequality.cucumber_selenium_maven_java.pages.LoginPage;
import com.luxequality.cucumber_selenium_maven_java.pages.InventoryPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static InventoryPage inventoryPage;

    /**
     * Initialize pages
     */
    public void initializer() {
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();

    }
}