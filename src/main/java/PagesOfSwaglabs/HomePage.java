package PagesOfSwaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    String productName = "sauce Labs Bolt T-shirt";

    private By headerArea = By.className("app_logo");
    private By productlink = By.xpath("//div[text()=\"" + productName + "\"]");

    public By getProductlink() {
        return productlink;
    }

    public By getHeaderArea() {
        return headerArea;

    }

    public void openProduct() {
        driver.findElement(productlink).click();

    }
}

