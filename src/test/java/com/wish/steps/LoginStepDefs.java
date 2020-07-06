package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.Given;

public class LoginStepDefs {

    public WishSite wishSite;

    public LoginStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @Given("I navigate to Wish")
    public void iNavigateToWish() throws InterruptedException {
        wishSite.getLogin().navigate();
        wishSite.getLogin().validateLoginPage();
        wishSite.getLogin().loginWithValidCredentials();
        Thread.sleep(60000);
    }
}