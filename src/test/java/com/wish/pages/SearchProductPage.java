package com.wish.pages;

import com.wish.utils.Producto;
import com.wish.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.Assert.*;

public class SearchProductPage extends BasePage{

    public SearchProductPage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(css="class*='FeedTileWidthWrapper-sc'")
    List<WebElement> productsList;

    @FindBy(css="[class*='FeedTile__ImageWrapper-sc'] img")
    WebElement nombreProducto;

    @FindBy(css="[class*='FeedTileWidthWrapper-sc'] [class*='ActualPrice']")
    WebElement precioProducto;

    @FindBy(css= "[class*='FeedTileWidthWrapper-sc'] [class*='CrossedPrice']")
    WebElement PrecioAnterior;

    public void validateSearchProductPage()
    {
        List<WebElement> productos = productsList;
        System.out.println("El total de productos son: "+productos.size());
        if (productos.size() > 1)
        {
            System.out.println("la lista se desplego correctamente");
        }
    }

    public void capturarDatosProducto(int i)
    {
        String prodName = nombreProducto.getText();
        prodName = prodName.replace(",","");

        String prodPrice = precioProducto.getText();
        prodPrice = prodPrice.replace("$", "");
        double price = Double.parseDouble(prodPrice);

        String prodOld = PrecioAnterior.getText();
        prodOld = prodOld.replace("$", "");
        double oldPrice = Double.parseDouble(prodOld);

        return new Producto(prodName, price, oldPrice);

    }

    public void clickOnFirstProduct(int numProduct) {
        List<WebElement> productos = productsList;
        WebElement producto = productos.get(numProduct - 1);
        producto.click();
    }
}
