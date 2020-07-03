package com.wish.pages;

import com.wish.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public RegistrationPage(WebDriver wd)
    {
        this.driver = wd;
        wait = new WebDriverWait(driver, Properties.LONG_WAIT);
    }

    @FindBy(css="div.AuthenticationPage__PaneWrapper-wo9hra-4.hVXHRo > div.AuthenticationPage__FormTabs-wo9hra-18.kHuBpd > div.AuthenticationPage__FormTab-wo9hra-19.isVqXQ")
    WebElement opcionRegistro;
    @FindBy(css="[name=firstname]")
    WebElement campoNombre;
    @FindBy(css="[name=lastname]")
    WebElement campoApellido;
    @FindBy(css="[name='emailAddress']")
    WebElement campoEmail;
    @FindBy(css="[name=password]")
    WebElement campoPassword;
    @FindBy(css="div.AuthenticationPage__PaneWrapper-wo9hra-4.hVXHRo > form.AuthenticationPage__FormWrapper-wo9hra-7.jCMLww > div.Button-sc-1rnmncq-0.dmiPZs.Button___StyledStyledWishButtonWithKeyboard-s129vo-0.hIOtUa")
    WebElement botonRegistrate;



}
