package org.fasttrackit.features.search;


import org.junit.Test;

public class RegisterTest extends BaseTest {


    @Test
    public void registerWithValidCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("nicolaetest2@yahoo.com", "Parola1234567@");
        registerSteps.clickRegisterButton();
        loginSteps.verifySuccessfulLoginMessage("nicolaetest2");
    }

    @Test
    public void registerWithAlreadyUsedCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("radunicolae9@gmail.com", "Parola123456@");
        registerSteps.clickRegisterButton();
        registerSteps.accountAlreadyRegisteredMessage();
    }

    @Test
    public void registerWithoutCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.clickRegisterButton();
        registerSteps.verifyNoCredentialsRegistrationError();
    }

    @Test
    public void registerWithInvalidCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("invalid@", "");
        registerSteps.clickRegisterButton();
        registerSteps.popUpAlertInvalidRegistrationEmail();
    }


}

