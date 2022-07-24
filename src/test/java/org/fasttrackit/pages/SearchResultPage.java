package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(css = ".azera_shop_grid_col_4 li")
    private List<WebElementFacade> productsList;
    @FindBy(css = ".woocommerce-info")
    private WebElementFacade searchResultsText;
    @FindBy(css = ".woocommerce-info")
    private WebElementFacade productResultsMessage;

    public boolean checkListForProduct(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".woocommerce-loop-product__title")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String product){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".woocommerce-loop-product__title")).getText().equalsIgnoreCase(product)){
                element.click();
                break;
            }
        }
    }

    public void verifySearchResultsText(String textFromElement){searchResultsText.getText();
        Assert.assertEquals("SEARCH RESULTS: “nnddppA@)=",textFromElement);
    }
    public void verifyProductResultsMessage(String textFromElement){productResultsMessage.getText();
        Assert.assertEquals("No products were found matching your selection.",textFromElement);}

}

