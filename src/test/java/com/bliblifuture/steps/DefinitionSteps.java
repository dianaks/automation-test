package com.bliblifuture.steps;

import com.bliblifuture.Behaviour.BlibliCustomerBehaviour;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bliblifuture.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    // Memasangkan story dengan behaviour yang telah didefinisikan

    @Steps
    BlibliCustomerBehaviour blibliEndUser;

    @Given("the user is on the blibli home page")
    public void givenTheUserIsOnTheBlibliHomePage(){
        blibliEndUser.is_open_home_page();
    }

    @When("the user is login to blibli")
    public void whenTheUserIsLoginToBlibli(){
        blibliEndUser.is_login();
    }

    @Then("the user can see")
    public void  thenTheUserCanSee(){
        blibliEndUser.should_see_word();
    }

    @Given("the user is in home page")
    public void givenTheUserIsInHomePage(){
    }

    @When("the user is search for '$productName'")
    public void whenTheUserIsSearchFor(String productName){
        blibliEndUser.fill_search_form(productName);
    }

    @Then("the user can see product '$productName'")
    public void thenTheUserCanSeeProduct(String productName){
        blibliEndUser.see_product(productName);
    }

    @Then("the user go to detail product")
    public void thenTheUserGoToDetailProduct(){
        blibliEndUser.go_to_detail_page();
    }

    @Then("the user add product to their cart")
    public void thenTheUserAddProductToTheirCart(){
        blibliEndUser.add_product_to_cart();
    }

    @Then("the user can see product in the cart '$productName'")
    public void thenTheUserCanSeeProductInTheCart(String productName){
        blibliEndUser.open_cart();
        blibliEndUser.see_product_name(productName);
    }

    @Given("the user is in cart and see '$productName'")
    public void givenTheUserIsInCart(String productName){
        blibliEndUser.see_product_name(productName);
    }

    @When("the user checkout")
    public void whenTheUserCheckout(){
        blibliEndUser.checkout();
    }

    @Then("the user choose the payment method")
    public void thenTheUserChooseThePaymentMethod(){
        blibliEndUser.choose_payment_method();
    }

    @Then("the user see thankyou page")
    public void thenTheUserSeeThankyouPage(){
        blibliEndUser.see_thankyou_page();
    }
}
