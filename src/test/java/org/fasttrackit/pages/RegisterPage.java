package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class RegisterPage extends BasePage {

    @FindBy(css = "#reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(css = "#reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css = ".col-2 .woocommerce-Button")
    private WebElementFacade registerButton;
    @FindBy(css = ".register")
    private WebElementFacade registerClass;
    @FindBy(css = ".col-2")
    private WebElementFacade registerForm;
    @FindBy(css = ".col-2 .required")
    private WebElementFacade registerRequiredFields;
    @FindBy(css = ".content-wrap")
    private WebElementFacade contentWrapClick;

    public void setUsernameField(String username){
        typeInto(registerEmailField, username);
    }
    public void setPasswordField(String password) {
        typeInto(registerPasswordField, password);
    }
    public void clickRegisterButton(){
        clickOn(contentWrapClick);
        clickOn(registerButton);
    }

    public void invalidEmailPopup(){
        String popUp = "Please include an '@' in the email address";
        Assert.assertTrue(popUp, true);
    }
}
