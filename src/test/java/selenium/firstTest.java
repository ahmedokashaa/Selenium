package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class firstTest {

        WebDriver driver = new ChromeDriver();
        By Email = By.xpath("//input[@data-qa='login-email']");
        By password = By.name("password");
        By login = By.xpath("//button[@type='submit' and text()='Login']");
        By correctlogin = By.xpath("//button[@type='button']");
        By incorrectogin = By.xpath("//p[text()='Your email or password is incorrect!']");
        By username = By.name("name");
        By email = By.xpath("//input[@data-qa='signup-email']");


        @Test
        public void ValidLogin () {
            driver.navigate().to("https://automationexercise.com/login");
            driver.findElement(Email).sendKeys("ahmedokasha3991@gmail.com");
            driver.findElement(password).sendKeys("ahmed1234");
            driver.findElement(login).click();
            boolean validlogin = driver.findElement(correctlogin).isDisplayed();
            Assert.assertTrue(validlogin);
        }

        public void InvalidLogin(){
            driver.navigate().to("https://automationexercise.com/login");
            driver.findElement(Email).sendKeys("ahmedokasha3991@gmail.com");
            driver.findElement(password).sendKeys("ahmed222");
            driver.findElement(login).click();
            boolean Invalidlogin = driver.findElement(incorrectogin).isDisplayed();
            Assert.assertTrue(Invalidlogin);

        }
    }


