package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.*;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }
    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected ProductSteps productSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @After
    public void closeDriver(){
        wait(1000);
        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
