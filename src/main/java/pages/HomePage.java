package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    String productName = "sauce Labs Rolt T-shirt";
    //elements
    By headerArea = By.className("app_logo");
    By productlink = By.xpath("//div[text()=\""+productName+"\"]");

    public void openProduct(){
        driver.findElement(productlink).click();

    }
}
