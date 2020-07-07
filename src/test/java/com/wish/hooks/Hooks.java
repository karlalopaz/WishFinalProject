package com.wish.hooks;

import com.wish.sites.WishSite;
import com.wish.utils.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;
    public WishSite wishSite;

    public WebDriver getDriver()
    {
        return driver;
    }

    public WishSite getWishSite()
    {
        return wishSite;
    }

    @Before
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Properties.SHORT_WAIT, TimeUnit.SECONDS);
        wishSite = new WishSite(driver);
        driver.manage().window().maximize();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
