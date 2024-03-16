package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends   BaseTest {

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By headerArea = By.className("app_logo");
    By errorButton = By.className("error-button");


    String username = "standard_user";
    String password = "secret_sauce";
    String invalidUsername = "mmmm";
    String invalidPassword = "nnnnn";

    @Test
    public void validLogin() {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        boolean isHeaderDisplayed = driver.findElement(headerArea).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }

    @Test
    public void invalidLogin() {
        driver.findElement(usernameField).sendKeys(invalidUsername);
        driver.findElement(passwordField).sendKeys(invalidPassword);
        driver.findElement(loginButton).click();
        boolean isHeaderDisplayed = driver.findElement(errorButton).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }
}
