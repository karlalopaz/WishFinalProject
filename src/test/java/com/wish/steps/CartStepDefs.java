package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartStepDefs {

    public WishSite wishSite;

    public CartStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @When("I open the cart")
    public void iOpenTheCart() {
        wishSite.getCart().validateCartPage();
    }

    @Then("I remove all the products")
    public void iRemoveAllTheProducts() {
        wishSite.getCart().removeAllProducts();
    }
}