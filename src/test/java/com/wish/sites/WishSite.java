package com.wish.sites;

import com.wish.pages.CartPage;
import com.wish.pages.HomePage;
import com.wish.pages.SearchProductPage;
import com.wish.pages.LoginPage;
import org.openqa.selenium.WebDriver;


public class WishSite {
    private final WebDriver driver;

    public SearchProductPage getSearchProduct()
    {
        return new SearchProductPage(driver);
    }

    public LoginPage getLogin()
    {
        return new LoginPage(driver);
    }

    public HomePage getHome()
    {
        return new HomePage(driver);
    }

    public CartPage getCart()
    {
        return new CartPage(driver);
    }

    private SearchProductPage searchProduct;
    private HomePage home;
    private LoginPage login;
    private CartPage cart;

    public WishSite(WebDriver driver)
    {
        this.driver = driver;
    }

}