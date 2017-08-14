package com.bliblifuture.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BlibliSearchResultPage extends PageObject {
    @FindBy(className="product-title")
    private List<WebElementFacade> productTitle;

    @FindBy(className = "single-product")
    private List<WebElementFacade> singleProduct;

    public List<WebElementFacade> getProductTitle() {
        return productTitle;
    }

    public List<WebElementFacade> getSingleProduct() {
        return singleProduct;
    }
}
