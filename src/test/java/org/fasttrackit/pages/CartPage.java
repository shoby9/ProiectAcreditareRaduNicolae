package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.List;

public class CartPage extends BasePage {

    private String discount="12345";

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successfulAddToCart;
    @FindBy(css =".cart_item .product-subtotal")
    private List<WebElementFacade> listOfProductsSubtotalSpan;
    @FindBy (css = ".checkout-button")
    private WebElementFacade checkoutButton;
    @FindBy(css = ".checkout-button button alt wc-forward")
    private WebElementFacade ProceedtocheckouButton;
    @FindBy(css = ".remove")
    private WebElementFacade removeFromCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageRemoveProduct;
    @FindBy(css = ".input-text")
    private WebElementFacade productQuantityField;
    @FindBy(css = "[name=\"update_cart\"]")
    private WebElementFacade updateCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade cartUpdated;
    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy (css = "input#coupon_code")
    private WebElementFacade couponField;
    @FindBy (css = "input.button")
    private WebElementFacade applyCouponButton;

    public void verifySuccessMessage(String productName){
        successfulAddToCart.containsText(productName + "has been added to your cart.");
    }

    public int getSubtotalPriceFromProducts(){
        int sum = 0;
        for (WebElementFacade element: listOfProductsSubtotalSpan){
            sum+=getPriceFromString(element.getText());
        }
        return sum;
    }

    public void removeFromCartButton(){
        clickOn(removeFromCartButton);
    }


    public void verifySuccessMessageRemoveProduct(String productName,String text){successMessageRemoveProduct.getText();
        Assert.assertEquals("“"+productName+"“removed.","“"+productName+"“" + text);
    }

    public void productQuantityField(){
        clickOn(productQuantityField);
        productQuantityField.clear();
        productQuantityField.sendKeys("20");
    }

    public void updateCartButton(){
        clickOn(updateCartButton);
    }

    public void verifyReturnToShopButton() {ProceedtocheckouButton.click();}

    public void cartUpdatedMessage(){
        cartUpdated.isDisplayed();
    }

    public void proceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public void addDiscount(){
        completeCouponField();
        clickApplyCouponButton();
    }

    public void clickApplyCouponButton(){
        clickOn(applyCouponButton);
    }

    public void completeCouponField(){
        typeInto(couponField,discount);
    }

    public void clickCheckoutButton(){
        waitABit(500);
        clickOn(checkoutButton);
    }


}

