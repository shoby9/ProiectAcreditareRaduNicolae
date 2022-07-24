package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchResultPage;

public class ProductSteps extends ScenarioSteps {

    private SearchResultPage searchResultsPage;
    private ProductPage productPage;
    private HomePage homePage;


    @Step
    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }

    @Step
    public void changeProductQuantity(){
        productPage.changeProductQuantity();
    }

    @Step
    public void sortProductsAverageRating(){
        productPage.sortProductsAverageRating();
    }

    @Step
    public void addAReview(){
        productPage.reviewsTab();
        productPage.clickReviewStar();
        productPage.reviewsMessage();
    }
    @Step
    public void clickCloseZoomPage() {productPage.clickCloseZoomPage();}

    @Step
    public void verifyZoomButton() {
        homePage.open();
        homePage.goToShopButton();
        ProductPage.selectProductFromShopList("Beanie");
        productPage.clickZoomButton();
    }
    @Step
    public void completeReview(){
        addAReview();
        productPage.clickSubmitReview();
    }

    @Step
    public void goToShop(){
        homePage.goToShopButton();
    }

}
