package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.Given;

public class StartStepsDefs {
    public WishSite wishSite;

    public StartStepsDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @Given("I navigate to wish site")
    public void userNavigatesStartPage()
    {
        wishSite.getStart().navegarSitio();
        wishSite.getStart().verificarPagina();
    }
}
