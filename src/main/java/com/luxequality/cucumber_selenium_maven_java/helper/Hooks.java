package com.luxequality.cucumber_selenium_maven_java.helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {

    @Before
    public void SetUp() {
        exe();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
