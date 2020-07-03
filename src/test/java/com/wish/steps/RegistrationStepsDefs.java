package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import cucumber.api.java.en.When;

public class RegistrationStepsDefs {

    public WishSite wishSite;

    public RegistrationStepsDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @When("I click on Registration")
    public void userRegister()
    {

    }
}
