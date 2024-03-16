package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By headerArea = By.className("app_logo");
    By errorButton = By.className("error-button");
    String productName ="sauce Labs Rolt T-shirt";
    By productlink = By.xpath("//div[text()=\""+productName+"\"]");
    By productPrice = By.className("inventory_details_price");




    String username = "standard_user";
    String password = "secret_sauce";
    String invalidUsername = "mmmm";
    String invalidPassword = "nnnnn";
    String ExpectedPrice = "$9.99";
    @Test
    public void validLogin () {
        driver.findElement(usernameField).sendKeys (username);
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

        public void validateProductPrice(){
                driver.findElement(usernameField).sendKeys(username);
                driver.findElement(passwordField).sendKeys(password);
                driver.findElement(loginButton).click();
                driver.findElement(productlink).click();
               String actualValue = driver.findElement(productPrice).getText();
               Assert.assertEquals(actualValue,ExpectedPrice);
}
}

