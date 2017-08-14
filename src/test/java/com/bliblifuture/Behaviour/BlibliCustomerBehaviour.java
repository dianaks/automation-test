package com.bliblifuture.Behaviour;

import com.bliblifuture.pages.BlibliCartPage;
import com.bliblifuture.pages.BlibliDetailProductPage;
import com.bliblifuture.pages.BlibliHomePage;
import com.bliblifuture.pages.BlibliSearchResultPage;
import javafx.beans.value.ObservableBooleanValue;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

// Mendefinisikan behaviour yang bisa dilakukan oleh sistem
public class BlibliCustomerBehaviour extends ScenarioSteps {
    BlibliHomePage blibliHome;
    BlibliCartPage blibliCart;
    BlibliDetailProductPage blibliDetailProduct;
    BlibliSearchResultPage blibliSearchResult;

    @Step
    public void is_open_home_page(){
        getDriver().get("https://www.blibli.com");
            }

    @Step
    public void is_login(){
        blibliHome.getLoginButton().click();
        blibliHome.getInputLoginEmail().type("");
        blibliHome.getInputLoginPassword().type("");
        blibliHome.getBtnSubmitLogin().click();
    }

    @Step
    public void should_see_word(){
        blibliHome.getLabelName().isCurrentlyVisible();
    }

    @Step
    public void fill_search_form(String productName){
        blibliHome.getFormSearch().type(productName);
        blibliHome.getBtnSearch().click();
    }

    @Step
    public void see_product(String productName){
        blibliSearchResult.getProductTitle().get(4).containsElements(productName);
    }

    @Step
    public void go_to_detail_page(){
        blibliSearchResult.getSingleProduct().get(4).click();
    }

    @Step
    public void add_product_to_cart(){
        blibliDetailProduct.getBtnAddToCart().click();
    }

    @Step
    public void see_product_detail(String productName){
        blibliDetailProduct.getProductNameLabel().containsElements(productName);
    }

    @Step
    public void open_cart(){
        blibliDetailProduct.getBtnOpenCart().click();
    }

    @Step
    public void see_product_name(String productName){
        blibliCart.getProductTitle().containsElements(productName);
    }

    @Step
    public void checkout(){
        blibliCart.getBtnCheckout().click();
        blibliCart.getBtnCheckout2().click();
    }

    @Step
    public void choose_payment_method(){
        blibliCart.getPaymentForm().type("haloo");
        blibliCart.getBtnCheckout3().click();
    }

    @Step
    public void see_thankyou_page(){
        blibliCart.getThankyou().containsElements("Thank you");
    }
}
