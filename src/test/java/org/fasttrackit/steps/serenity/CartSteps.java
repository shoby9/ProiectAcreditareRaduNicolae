package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.utils.Constants;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;
    private HomePage homePage;


    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifySuccessfulAddToCartMessage(String productName){
        cartPage.verifySuccessMessage(productName);
    }

    @Step
    public void clickCartButton(){
        homePage.goToCartButton();
    }

    @Step
    public void removeFromCartButton(){
        cartPage.removeFromCartButton();
    }

    @Step
    public void verifySuccessMessageRemoveProduct(String productName,String text) {
        cartPage.verifySuccessMessageRemoveProduct(productName,text);}

    @Step
    public void changeProductQuantity(){
        cartPage.productQuantityField();
        cartPage.updateCartButton();
    }
    @Step
    public void cartUpdatedMessage(){
        cartPage.cartUpdatedMessage();
    }

    @Step
    public void verifyProceedToCheckoutButton(String text) {
        homePage.open();
        homePage.goToCartButton();
        cartPage.proceedToCheckoutButton();
    }

    @Step
    public void getSubtotalPrice() {
        cartPage.getSubtotalPriceFromProducts();
    }

}

