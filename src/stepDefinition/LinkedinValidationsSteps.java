package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LinkedinValidationsSteps {
    WebDriver driver;
    boolean signInEnabled;
    String actualTitle;
    String expectedTitle;

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.linkedin.com/");
    }

    @Given("^he checks if the signin button is enabled or not$")
    public void he_checks_if_the_signin_button_is_enabled_or_not() throws Throwable {
        signInEnabled = driver.findElement(By.id("login-submit")).isEnabled();
    }

    @Then("^it must not be enabled$")
    public void it_must_not_be_enabled() throws Throwable {
        Assert.assertFalse(signInEnabled);

    }

    @Given("^he checks the title$")
    public void he_checks_the_title() throws Throwable {
        actualTitle = driver.getTitle();
    }

    @Then("^it must be equal to \"([^\"]*)\"$")
    public void it_must_be_equal_to(String arg1) throws Throwable {
        expectedTitle = arg1;
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.quit();
    }






}
