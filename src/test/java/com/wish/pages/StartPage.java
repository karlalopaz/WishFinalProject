package com.wish.pages;

import com.wish.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.Assert.*;

public class StartPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public StartPage(WebDriver wd)
    {
        this.driver = wd;
        wait = new WebDriverWait(driver, Properties.LONG_WAIT);
    }

    @FindBy(css="AuthenticationPage__TrustFeatureLogoWrapper-wo-1hra-22 bCsZBi")
    WebElement logoWish;

    @FindBy(css="AuthenticationPage__TrustFeatureWrapper-wo9hra-21 MrWHO")
    WebElement banner;

    @FindBy(css="AuthenticationPage__LeftContentWrapper-wo9hra-1 ctcnFp")
    WebElement productos;

    public void navegarSitio()
    {
        driver.get(Properties.URL);
    }

    public void verificarPagina() {
        wait.until(ExpectedConditions.visibilityOf(logoWish));
        assertTrue(logoWish.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(banner));
        assertTrue(banner.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(productos));
        assertTrue(productos.isDisplayed());
    }
}
