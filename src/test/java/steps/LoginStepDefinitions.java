package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.LoginPage;
import pages.MainPage;

public class LoginStepDefinitions {
    private WebDriver driver;
    @Given("The regular user is in the login page of orangeHRM")
    public void the_regular_user_is_in_the_login_page_of_orange_hrm()  // you can change method name
    {
       driver=new EdgeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.manage().window().maximize();
    }
    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        LoginPage login =new LoginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

    }
    @Then("the user will be redirected to the homepage")
    public void th_user_will_be_redirected_to_the_homepage() {
        MainPage  main=new MainPage(driver);
        assertEquals(main.getTest(),"Dashboard");
    }

    @When("the user enter invalid credentials")
    public void the_user_enter_invalid_credentials() {
        LoginPage login =new LoginPage(driver);
        login.enterUsername("Sandy");
        login.enterPassword("admin3");
        login.clickLogin();
    }
    @Then("the error message will apprear called Invalid credentials")
    public void the_error_message_will_apprear_called_invalid_credentials() {
        MainPage main = new MainPage(driver);
        assertEquals(main.getErrorMessage(), "Invalid credentials");

    }

        @When("the user enter valid username without password")
        public void the_user_enter_valid_username_without_password() {

            LoginPage login =new LoginPage(driver);
            login.enterUsername("Admin");
            login.enterPassword("");
            login.clickLogin();

        }
        @Then("the message will apprear under the password field called required")
        public void the_message_will_apprear_under_the_password_field_called_required() {
            MainPage main = new MainPage(driver);
            assertEquals(main.getErrorMessageForPasswordField(), "Required");
        }



    @When("the user enter valid password without username")
    public void the_user_enter_valid_password_without_username() {
        LoginPage login =new LoginPage(driver);
        login.enterUsername("");
        login.enterPassword("admin123");
        login.clickLogin();
    }

    @Then("the message will apprear under the username field called required")
    public void the_message_will_apprear_under_the_username_field_called_required() {

        MainPage main = new MainPage(driver);
        assertEquals(main.getErrorMessageForUsernameField(),"Required");
    }


    @When("the user press on login button")
    public void the_user_press_on_login_button() {
        LoginPage login =new LoginPage(driver);
        login.enterUsername("");
        login.enterPassword("");
        login.clickLogin();
    }
    @Then("the two messages will apprear under the username field and password field called required")
    public void the_two_messages_will_apprear_under_the_username_field_and_password_field_called_required() {

        MainPage main = new MainPage(driver);
        assertEquals(main.getErrorMessageForUsernameField(),"Required");
        assertEquals(main.getErrorMessageForPasswordField(),"Required");
    }
    }








