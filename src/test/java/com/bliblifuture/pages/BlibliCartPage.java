package com.bliblifuture.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Test;

public class BlibliCartPage extends PageObject {
    @FindBy(className = "cart-product-title")
    private WebElementFacade productTitle;

    @FindBy(id="gdn-sb-page-continue-checkout")
    private WebElementFacade btnCheckout;

    @FindBy(id="gdn-next-step")
    private WebElementFacade btnCheckout2;

    @FindBy(id="payment_userid")
    private WebElementFacade paymentForm;

    @FindBy(id="gdn-submit-checkout")
    private WebElementFacade btnCheckout3;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
    private WebElementFacade thankyou;

    public WebElementFacade getProductTitle() {
        return productTitle;
    }

    public WebElementFacade getBtnCheckout() {
        return btnCheckout;
    }

    public WebElementFacade getBtnCheckout2() {
        return btnCheckout2;
    }

    public WebElementFacade getPaymentForm() {
        return paymentForm;
    }

    public WebElementFacade getBtnCheckout3() {
        return btnCheckout3;
    }

    public WebElementFacade getThankyou() {
        return thankyou;
    }
}
