package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static driver.DriverFactory.getDriver;

public class Login {
    private WebDriver driver = getDriver();

    @Given("I access Login Page of WebDriverUniversity")
    public void loginPage() {
        driver.navigate().to("https://www.webdriveruniversity.com/Login-Portal/index.html");
    }

    @When("I enter username {word}")
    public void userName(String userName) {
        driver.findElement(By.cssSelector("input[id='text']")).sendKeys(userName);
    }

    @And("I enter password {word}")
    public void passWord(String passWord) {
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys(passWord);
    }

    @And("I click on Login Button")
    public void i_click_on_login_button() {
        driver.findElement(By.cssSelector("button[id='login-button']")).click();
    }

    @Then("I verify the error message")
    public void i_verify_the_error_message() {
        String alertErrorMessage = driver.switchTo().alert().getText();
        if (alertErrorMessage.equals("validation failed")) {
            System.out.println("Error Message is successfully displayed");
        }
        driver.switchTo().alert().accept();
    }

    @Then("I verify the successful loggedIn message")
    public void i_verify_the_successful_message() {
        String alertSuccessMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(alertSuccessMessage, "validation succeeded");
        driver.switchTo().alert().accept();
    }

    @Then("I verify the message {string}")
    public void i_verify_the_message(String message) {
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, message);
        driver.switchTo().alert().accept();
    }
}