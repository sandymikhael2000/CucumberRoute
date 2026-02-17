package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton =By.xpath("//button[text()=' Login ']");
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
    }


    public void enterUsername(String username) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        WebElement usernameElem = driver.findElement(usernameField);
        usernameElem.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElem = driver.findElement(passwordField);
        passwordElem.sendKeys(password);
    }

    public MainPage clickLogin() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
        driver.findElement(loginButton).click();
        return new MainPage(driver);

    }
}
