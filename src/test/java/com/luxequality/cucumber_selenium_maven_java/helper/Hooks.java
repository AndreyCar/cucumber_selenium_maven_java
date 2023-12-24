package com.luxequality.cucumber_selenium_maven_java.helper;

import org.junit.After;
import org.junit.Before;

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
