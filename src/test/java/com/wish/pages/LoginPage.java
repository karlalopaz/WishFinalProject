package com.wish.pages;

import com.wish.utils.Passwords;
import com.wish.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.Assert.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(css="g[fill='#2fb7ec']")
    WebElement logoWish;

    @FindBy(xpath = "//form/div[1]/div/input")
    WebElement loginEmail;

    @FindBy(xpath = "//*//div[3]/form/div[2]//input")
    WebElement loginPassword;

    @FindBy(xpath = "//div[3]/form/div[4]")
    WebElement loginButton;

    public void navigate()
    {
        driver.get(Properties.URL);
    }

    public void validateLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(logoWish));
        assertTrue(logoWish.isDisplayed());

    }

    public void loginWithValidCredentials()
    {
        assertTrue(loginEmail.isDisplayed());
        assertTrue(loginPassword.isDisplayed());
        loginEmail.sendKeys(Passwords.EMAIL);
        loginPassword.sendKeys(Passwords.PASSWORD);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        System.out.println("Login successful");
    }
}
