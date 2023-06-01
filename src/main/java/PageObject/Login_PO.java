package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVariable;

public class Login_PO  extends Base_PO {
    private @FindBy(css = "input[id='text']")
    WebElement userNameTextField;
    private @FindBy(css = "input[id='password']")
    WebElement passWordTextField;
    private @FindBy(css = "button[id='login-button']")
    WebElement loginButton;

    public Login_PO() {
        super();
    }

    public void navigateToLoginPage() {
        navigateToURL(GlobalVariable.WebDriverUniversityURL.concat("Login-Portal/index.html"));
    }

    public void enterUserName(String userName) {
        sendKeys(userNameTextField, userName);
    }

    public void enterPassWord(String passWord) {
        sendKeys(passWordTextField, passWord);
    }

    public void i_click_on_login_button() {
        click(loginButton);
    }

    public void i_verify_the_error_message() {
        getTextFromAlert("validation failed");
    }

    public void i_verify_the_successful_message() {
        getTextFromAlert("validation succeeded");
    }

    public void i_verify_the_message(String message) {
        getTextFromAlert(message);
    }
}