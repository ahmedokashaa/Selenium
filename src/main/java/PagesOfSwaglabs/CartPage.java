package PagesOfSwaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
      private By removeButton = By.id("remove-sauce-labs-bike-light");
     private By continuoShopingButton = By.id("continue-shopping");
     private By checkout = By.id("checkout");

        public By getcontinuoShopingButton() {
            return continuoShopingButton;
        }
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




