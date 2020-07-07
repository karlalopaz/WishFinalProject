package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.And;

public class SearchProductStepDefs {

    public WishSite wishSite;

    public SearchProductStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @And("I click on the first product")
    public void iClickOnTheFirstProduct() {
        wishSite.getSearchProduct().validateSearchProductPage();
        wishSite.getSearchProduct().capturarDatosProducto(1);
        wishSite.getSearchProduct().clickOnFirstProduct(1);
    }
}