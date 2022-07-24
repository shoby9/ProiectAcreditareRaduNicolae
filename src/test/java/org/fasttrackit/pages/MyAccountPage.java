package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".woocommerce-MyAccount-content p")
    private WebElementFacade successfulLoginText;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade unsuccessfulLoginText;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsLoginText;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successfulPassReset;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade accountAlreadyRegistered;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsRegisterError;

    public void verifySuccessfulLoginMessage(String username) {
        successfulLoginText.shouldContainOnlyText("Hello " + username + " (not " + username + "? Log out)");
    }

    public void verifyUnsuccessfulLoginMessage(String text) {
        unsuccessfulLoginText.shouldBeVisible();
    }
    public void verifyLoginWithoutCredentialsText(String text) {
        noCredentialsLoginText.shouldContainText(text);
    }
    public void verifySuccessfulPassResetMessage(String text) {
        successfulPassReset.shouldContainText(text);
    }
    public void accountAlreadyRegisteredMessage() {
        accountAlreadyRegistered.shouldBeVisible();
    }
    public void noCredentialsRegistrationError() {
        noCredentialsRegisterError.shouldBeVisible();
    }


}

