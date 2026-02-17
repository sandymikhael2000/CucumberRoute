package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    private final By titleMessage= By.tagName("h6");
    private final By errorMessage= By.xpath("//p");
    private final By errorMessageForPasswordField= By.xpath("//span");
    private final By errorMessageForUsernameField= By.xpath("//span");
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getTest() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(titleMessage));
        return driver.findElement(titleMessage).getText();
    }

    public String getErrorMessage() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }


    public String getErrorMessageForPasswordField() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageForPasswordField));
        return driver.findElement(errorMessageForPasswordField).getText();
    }

    public String getErrorMessageForUsernameField() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageForUsernameField));
        return driver.findElement(errorMessageForUsernameField).getText();
    }
}
