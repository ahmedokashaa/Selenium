package PagesOfSwaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage( WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private  By ErrorButton = By.className("error-button");

    public By getErrorButton(){
        return ErrorButton;
    }
    //actions

    public void Login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();

    }
}
