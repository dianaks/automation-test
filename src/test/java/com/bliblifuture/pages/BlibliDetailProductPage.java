package com.bliblifuture.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlibliDetailProductPage extends PageObject {
    @FindBy(id="gdn-add-to-cart-top")
    private WebElementFacade btnAddToCart;

    @FindBy(className = "product-name")
    private WebElementFacade productNameLabel;

    @FindBy(id="gdn-cart-button")
    private WebElementFacade btnOpenCart;

    public WebElementFacade getBtnAddToCart() {
        return btnAddToCart;
    }

    public WebElementFacade getBtnOpenCart() {
        return btnOpenCart;
    }

    public WebElementFacade getProductNameLabel() {
        return productNameLabel;
    }
}
