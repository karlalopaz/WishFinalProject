package com.wish.steps;

import com.wish.hooks.Hooks;
import com.wish.sites.WishSite;
import com.wish.utils.Producto;
import cucumber.api.java.en.Then;

public class ProductStepDefs {
    public WishSite wishSite;

    public ProductStepDefs(Hooks hooksClass)
    {
        this.wishSite = hooksClass.getWishSite();
    }

    @Then("I add the product into the cart")
    public void iAddTheProductIntoTheCart()
    {
        wishSite.getProduct().validarDatosProducto(primerProd);
        wishSite.getProduct().setSize();
        wishSite.getProduct().setColor();
        wishSite.getProduct().addToCart();
        wishSite.getProduct().validateProductAddedToCart();
    }
}
