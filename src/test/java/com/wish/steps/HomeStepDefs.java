package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HomeStepDefs
{

    public WishSite wishSite;

    public HomeStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @When("I enter a product name in the search bar")
    public void iEnterAProductNameInTheSearchBar() {
        wishSite.getHome().validateHomePage();
        wishSite.getHome().searchProduct();
    }

    @And("I have products added in the cart")
    public void iHaveProductsAddedInTheCart() {
        //solo se puede usar la función de abajo si nuestra decisión fue solo validar que el número de items en el carrito aumentara al agregar
        wishSite.getSearchProduct().validateProductAddedToCart();
    }
}