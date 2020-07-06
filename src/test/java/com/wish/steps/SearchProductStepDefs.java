package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchProductStepDefs {

    public WishSite wishSite;

    public SearchProductStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @And("I click on the first product")
    public void iClickOnTheFirstProduct() {
        wishSite.getSearchProduct().validateSearchProductPage();
        wishSite.getSearchProduct().clickOnFirstProduct();
    }

    @Then("I add the product into the cart")
    public void iAddTheProductIntoTheCart() {
        wishSite.getSearchProduct().setSize();
        wishSite.getSearchProduct().setColor();
        wishSite.getSearchProduct().addToCart();
        wishSite.getSearchProduct().validateProductAddedToCart();
    }
}