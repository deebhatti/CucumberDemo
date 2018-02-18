package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;

    @Given("^the user is on the home page of the application$")
    public void the_user_is_on_the_home_page_of_the_application() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
    }

    @When("^he enter is valid username$")
    public void he_enter_is_valid_username() throws Throwable {
        driver.findElement(By.name("userName")).sendKeys("mercury");
    }
    //Adding a commeent with wrong spellings
    @When("^his valid password$")
    public void his_valid_password() throws Throwable {
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
    }

    @Then("^he must be able to login into the application successfully$")
    public void he_must_be_able_to_login_into_the_application_successfully() throws Throwable {
       boolean signOffPresent =  driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
        Assert.assertTrue(signOffPresent);
    }

    @When("^he enters invalid \"([^\"]*)\"$")
    public void he_enters_invalid(String arg1) throws Throwable {
        driver.findElement(By.name("userName")).sendKeys(arg1);
    }

    @When("^he enters his invalid \"([^\"]*)\"$")
    public void he_enters_his_invalid(String arg1) throws Throwable {
        driver.findElement(By.name("password")).sendKeys(arg1);
        driver.findElement(By.name("login")).click();
    }

    @Then("^he must not be able to login$")
    public void he_must_not_be_able_to_login() throws Throwable {
        boolean signOnPresent =  driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
        Assert.assertTrue(signOnPresent);
    }





}
