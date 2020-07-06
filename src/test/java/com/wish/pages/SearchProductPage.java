package com.wish.pages;

import com.wish.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.Assert.*;

public class SearchProductPage extends BasePage{

    public SearchProductPage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void validateSearchProductPage(){
    }

    public void clickOnFirstProduct() {
    }

    public void setSize() {
    }

    public void setColor() {
    }

    public void addToCart() {
    }

    public void validateProductAddedToCart(){

        //Podríamos validar que el número en el carrito se incrementa o
        //validar el mensaje que aparece tras agregar un producto al carrito (veo mas dificil validar el mensaje porque desaparece rápido)
    }
}
