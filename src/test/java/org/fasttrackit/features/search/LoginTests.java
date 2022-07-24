package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class LoginTests extends BaseTest {

    @Test
    public void logInWithValidCredentials() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifySuccessfulLoginMessage("radunicolae9");
    }

    @Test
    public void logInWithInvalidCredentials() {
        loginSteps.goToMyAccount();
        loginSteps.setCredentials("testQA@gmail.com", "123ertbjklkm@");
        loginSteps.clickLoginButton();
        loginSteps.verifyUnsuccessfulLoginMessage("ERROR");
    }

    @Test
    public void logInWithoutCredentials() {
        loginSteps.goToMyAccount();
        loginSteps.clickLoginButton();
        loginSteps.verifyLogInWithoutCredentialsText("Error: Username is required.");
    }

    @Test
    public void resetAccountForgottenPassword() {
        loginSteps.goToMyAccount();
        loginSteps.clickForgotPassword();
        loginSteps.inputEmailForAccountPasswordReset("radunicolae9@gmail.com");
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }
}