package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By removeButton = By.id("remove-sauce-labs-bike-light");
    By continuoShopingButton = By.id("continue-shopping");
    By checkout = By.id("checkout");


    public void removeButton() {
        driver.findElement(removeButton).click();
    }

    public void ContinuoShopingButton() {
        driver.findElement(continuoShopingButton).click();
    }

    public void Checkout() {

        driver.findElement(checkout).click();
    }
}




