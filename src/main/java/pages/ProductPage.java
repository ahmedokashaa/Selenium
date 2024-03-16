package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {
    WebDriver driver;

    String productName = "sauce Labs Rolt T-shirt";
    //elements
    By productPrice = By.className("inventory_details_price");

    By addCard = By.id("add-to-cart-sauce-labs-bike-light");
    By carButton = By.xpath("//a[@class='shopping_cart_link']");

    public void AddtoCart() {
        driver.findElement(addCard).click();
    }
    public void  ClicktoCart()   {
        driver.findElement(carButton).click();
    }



}
