package com.wish.pages;

import com.wish.utils.Producto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(xpath = "//div[2]/div/div[1]/h1")
    WebElement prodName;

    @FindBy(xpath = "//div[2]/div[2]/div/div[1]/div[2]/div/div[1]")
    WebElement prodPrice;

    @FindBy(xpath = "//*[@id=\"d910562a-846b-4321-8ada-8a0d16875883\"]/div/div[1]/div/div[1]/a/div[2]/div[1]/div[1]/div[2]")
    WebElement realPrice;

    public void validarDatosProducto(Producto primerProd)
    {
        String nameProd = prodName.getText();
        String priceProd = prodPrice.getText();
        priceProd = priceProd.replace("$", "");
        double pe = Double.parseDouble(priceProd);
        String oldPrice = realPrice.getText();
        oldPrice = oldPrice.replace("$", "");
        double op = Double.parseDouble(oldPrice);

        System.out.println("El nombre del producto es: " + nameProd);

        if (primerProd.getPrecio() == (pe)) {
            System.out.println("El precio del producto concuerda");
        } else {
            System.out.println("El precio del producto no concuerda");
        }

        if (primerProd.getPrecioAnterior() == (op)) {
            System.out.println("El precio anterior del producto concuerda");
        } else {
            System.out.println("El precio anterior del producto no concuerda");
        }
    }

    public void setSize() {
    }

    public void setColor() {
    }

    public void addToCart() {
    }

    public void validateProductAddedToCart() {

        //Podríamos validar que el número en el carrito se incrementa o
        //validar el mensaje que aparece tras agregar un producto al carrito (veo mas dificil validar el mensaje porque desaparece rápido)
    }
}

