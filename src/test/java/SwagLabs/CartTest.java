package SwagLabs;
import PagesOfSwaglabs.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String FirstName = "Ahmed";
    String LastName = "Okasha";
    String PostalCode = "223344";
@Test
    public void CheckOutFunction() {
        LoginPage login = new LoginPage(driver);
        login.Login(validUsername, validPassword);
        HomePage home = new HomePage(driver);
        home.openProduct();
        ProductPage product = new ProductPage(driver);
        product.AddtoCart();
        product.ClicktoCart();
        CartPage cart = new CartPage(driver);
        cart.Checkout();
        CheckOutPage checkout = new CheckOutPage(driver);
        checkout.ClickToContinue(FirstName, LastName, PostalCode);
        OverViewPage overview = new OverViewPage(driver);
        overview.ClickToFinishButton();
        FinishPage finish = new FinishPage();
        boolean AssertMainFunction = driver.findElement(finish.GetFinish()).isDisplayed();
        Assert.assertTrue(AssertMainFunction);
    }
}
