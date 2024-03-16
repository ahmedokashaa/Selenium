package test;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductTest extends BaseTest {


    String productName = "sauce Labs Rolt T-shirt";

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productlink = By.xpath("//div[text()=\"" + productName + "\"]");
    By productPrice = By.className("inventory_details_price");

    String username = "standard_user";
    String password = "secret_sauce";
    String ExpectedPrice = "$9.99";

    public void validateProductPrice() {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        driver.findElement(productlink).click();
        String actualValue = driver.findElement(productPrice).getText();
        Assert.assertEquals(actualValue, ExpectedPrice);



        }

    }


