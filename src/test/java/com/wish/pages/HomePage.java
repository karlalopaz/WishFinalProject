package com.wish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{

    public HomePage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(css= "NavbarSearchBar__SearchInput-")
    WebElement searchBar;

    public void validateHomePage(){

    }

    public void searchProduct() {
        searchBar.sendKeys("tennis adidas");
        searchBar.submit();
    }
}