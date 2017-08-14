package com.bliblifuture.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


// Deklarasi komponen-komponen yang ada didalam page

public class BlibliHomePage extends PageObject {

    @FindBy(id="gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id="gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id="loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id="loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id="gdn-submit-login")
    private WebElementFacade btnSubmitLogin;

    @FindBy(id="gdn-already-login-label")
    private WebElementFacade labelName;

    @FindBy(name="s")
    private WebElementFacade formSearch;

    @FindBy(id="gdn-search-button")
    private WebElementFacade btnSearch;

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public WebElementFacade getBtnSubmitLogin() {
        return btnSubmitLogin;
    }

    public WebElementFacade getLabelName() {
        return labelName;
    }

    public WebElementFacade getFormSearch() {
        return formSearch;
    }

    public WebElementFacade getBtnSearch() {
        return btnSearch;
    }
}
