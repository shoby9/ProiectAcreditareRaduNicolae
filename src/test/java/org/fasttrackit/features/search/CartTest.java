package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("cap");
        productSteps.selectProductFromList("cap");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessfulAddToCartMessage("\"cap\"");
    }

    @Test
    public void removeProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("beanie");
        productSteps.selectProductFromList("beanie");
        cartSteps.clickAddToCart();
        cartSteps.clickCartButton();
        cartSteps.removeFromCartButton();
        cartSteps.verifySuccessMessageRemoveProduct("beanie","removed.");
    }

    @Test
    public void changeProductQuantityFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("new hat");
        productSteps.selectProductFromList("new hat");
        cartSteps.clickAddToCart();
        cartSteps.clickCartButton();
        cartSteps.changeProductQuantity();
        cartSteps.cartUpdatedMessage();
    }

    @Test
    public void verifyProceedToCheckoutButton() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.verifyProceedToCheckoutButton("ProceedToCheckout");}


}
