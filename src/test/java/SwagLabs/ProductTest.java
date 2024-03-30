package SwagLabs;

import PagesOfSwaglabs.HomePage;
import PagesOfSwaglabs.LoginPage;
import PagesOfSwaglabs.ProductPage;
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
        LoginPage login= new LoginPage(driver);
        login.Login(username,password);
        HomePage home = new HomePage(driver);
        home.openProduct();
        ProductPage product = new ProductPage(driver);
        String actualValue = driver.findElement(product.getProductPrice()).getText();
        Assert.assertEquals(actualValue, ExpectedPrice);



        }

    }


