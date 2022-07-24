package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutWithAValidProduct(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("cap");
        productSteps.selectProductFromList("cap");
        cartSteps.clickAddToCart();
        checkoutSteps.clickCheckoutMenuButton();
        checkoutSteps.fillInCheckoutFields();
        checkoutSteps.orderComments("I want to receve the product after 20 of july");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.successfulOrderMsg();
    }

    @Test
    public void checkoutWithoutAnyProduct(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        checkoutSteps.clickCheckoutMenuButton();
        checkoutSteps.emptyCartCantCheckoutMessage();
    }

    @Test
    public void verifytotalPrice() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        checkoutSteps.proceedToCheckOutWithDiscount();
        cartSteps.getSubtotalPrice();
    }
}

