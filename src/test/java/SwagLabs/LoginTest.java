package SwagLabs;

import PagesOfSwaglabs.HomePage;
import PagesOfSwaglabs.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest {


    String username = "standard_user";
    String password = "secret_sauce";
    String invalidUsername = "mmmm";
    String invalidPassword = "nnnnn";

    @Test
    public void validLogin() {
        LoginPage login = new LoginPage(driver);
        login.Login(username, password);
        HomePage home = new HomePage(driver);
        boolean isHeaderDisplayed = driver.findElement(home.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);

    }

    @Test
    public void invalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.Login(invalidUsername, invalidPassword);
        boolean isHeaderDisplayed = driver.findElement(login.getErrorButton()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }
}

