package PagesOfSwaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

        String productName = "sauce Labs Rolt T-shirt";
        //elements
        private By productPrice = By.className("inventory_details_price");
        private By addCard = By.id("add-to-cart-sauce-labs-bike-light");
        private By carButton = By.xpath("//a[@class='shopping_cart_link']");

        public By getProductPrice() {
            return productPrice;

        }

        public void AddtoCart () {
            driver.findElement(addCard).click();
        }
        public void ClicktoCart () {
            driver.findElement(carButton).click();
        }
    }









