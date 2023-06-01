package StepDefinition;

import PageObject.Base_PO;
import PageObject.Login_PO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base_PO {
    private Login_PO loginPO;
    public Login(Login_PO loginPO){
        this.loginPO = loginPO;
    }

    @Given("I access Login Page of WebDriverUniversity")
    public void loginPage() {
        loginPO.navigateToLoginPage();
    }

    @When("I enter username {word}")
    public void userName(String userName) {
        loginPO.enterUserName(userName);
    }

    @And("I enter password {word}")
    public void passWord(String passWord) {
        loginPO.enterPassWord(passWord);
    }

    @And("I click on Login Button")
    public void i_click_on_login_button() {
        loginPO.i_click_on_login_button();
    }

    @Then("I verify the error message")
    public void i_verify_the_error_message() {
        loginPO.i_verify_the_error_message();
    }

    @Then("I verify the successful loggedIn message")
    public void i_verify_the_successful_message() {
        loginPO.i_verify_the_successful_message();
    }

    @Then("I verify the message {string}")
    public void i_verify_the_message(String message) {
        loginPO.i_verify_the_message(message);
    }
}