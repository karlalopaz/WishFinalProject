package com.wish.sites;

import com.wish.pages.HomePage;
import com.wish.pages.StartPage;
import com.wish.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;


public class WishSite {
    private final WebDriver driver;

    public StartPage getStart()
    {
        return new StartPage(driver);
    }

    public RegistrationPage getRegister()
    {
        return new RegistrationPage(driver);
    }

    public HomePage getHome()
    {
        return new HomePage(driver);
    }

    private StartPage main;
    private HomePage home;
    private RegistrationPage register;

    public WishSite(WebDriver driver)
    {
        this.driver = driver;
    }

}
