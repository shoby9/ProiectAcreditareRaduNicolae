package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void changeProductQuantity(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Cap");
        productSteps.selectProductFromList("Cap");
        productSteps.changeProductQuantity();
    }


    @Test
    public void verifyZoomButton() {
        productSteps.verifyZoomButton();
        productSteps.clickCloseZoomPage();
    }

    @Test
    public void leaveAReview(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Cap");
        searchSteps.selectProductFromList("Cap");
        productSteps.completeReview();
    }
    @Test
    public void sortProductsByAverageRating(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        productSteps.goToShop();
        productSteps.sortProductsAverageRating();
    }


}