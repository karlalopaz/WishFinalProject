package com.wish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage
{

    public HomePage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(xpath="//div/input")
    WebElement searchBar;
    @FindBy(css = "path[d=\"M1 1l8 8M9 1L1 9\"]")
    WebElement modal1;
    @FindBy(xpath="//*[@id=\"react-app\"]/div/div[1]/div[1]/div/div[2]/div[1]/div[2]")
    WebElement searchIcon;

    public void validateHomePage()
    {
        wait.until(ExpectedConditions.visibilityOf(modal1)).click();
        wait.until(ExpectedConditions.visibilityOf(searchBar));
    }

    public void searchProduct()
    {
        searchBar.sendKeys("tennis adidas");
        searchIcon.click();
    }


}