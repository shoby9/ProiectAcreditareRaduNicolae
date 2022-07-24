package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class ProductPage extends BasePage {

    String quantity= RandomStringUtils.randomNumeric(1);
    String review="Nice material and good Cap :)";


    @FindBy(css = "[name=add-to-cart]")
    private WebElementFacade addToCartButton;

    @FindBy (css = ".azera_shop_grid_col_4 li:first-child")
    private WebElementFacade firstProduct;

    @FindBy(css = ".pswp__button--close")
    private WebElementFacade closeZoomPageButton;

    @FindBy(css = ".entry-title.ak-container")
    private static WebElementFacade shopPageTitle;

    @FindBy(css = ".woocommerce-product-gallery__trigger")
    private WebElementFacade zoomButton;

    @FindBy(css = ".input-text")
    private WebElementFacade productQuantityField;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade quantityAddedToCart;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdown;

    @FindBy(css ="option:nth-child(2)")
    private WebElementFacade sortAverageRating;

    @FindBy (css = "li#tab-title-reviews")
    private WebElementFacade reviewTab;

    @FindBy (css = ".star-4")
    private WebElementFacade reviewRating;

    @FindBy (css = "textarea#comment")
    private WebElementFacade reviewMessage;


    @FindBy (css = ".submit")
    private WebElementFacade submitReview;

    @FindBy(css = ".products li")
    private static List<WebElementFacade> productsShopList;

    @FindBy(css = ".product_title")
    private WebElementFacade nameOfProduct;


    public void reviewsMessage(){
        typeInto(reviewMessage,review);
    }

    public static void verifyShopPageTitle(String text){shopPageTitle.getText();
        Assert.assertEquals("SHOP",text);
    }

    public void clickSubmitReview(){
        clickOn(submitReview);
    }

    public void clickReviewStar(){
        clickOn(reviewRating);
    }

    public void reviewsTab(){
        clickOn(reviewTab);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void changeProductQuantity(){
        clickOn(productQuantityField);
        productQuantityField.clear();
        productQuantityField.sendKeys("7");
    }

    public void sortProductsBy(){
        clickOn(sortByDropdown);
    }

    public void sortProductsAverageRating(){
        sortProductsBy();clickOn(sortAverageRating);
    }

    public void clickCloseZoomPage() { clickOn(closeZoomPageButton);}

    public void clickZoomButton() { clickOn(zoomButton); }

    public static void selectProductFromShopList(String product){
        for(WebElementFacade element : productsShopList){
            if(element.findElement(By.cssSelector(".woocommerce-loop-product__title")).getText().equalsIgnoreCase(product)){
                element.click();
                break;
            }
        }
    }

    public void verifySuccessSearchProduct(String textFromElement){nameOfProduct.getText();
        Assert.assertEquals("Beanie with Logo",textFromElement);}


    public void selectFirstProduct(){
        clickOn(firstProduct);
    }


}

