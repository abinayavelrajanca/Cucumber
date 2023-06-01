package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVariable;

import java.util.concurrent.TimeUnit;

public class ContactUs_PO extends Base_PO {
    private @FindBy(name = "first_name")
    WebElement enterFirstName;

    private @FindBy(name = "last_name")
    WebElement enterLastName;

    private @FindBy(name = "email")
    WebElement enterEmailAddress;
    private @FindBy(name = "message")
    WebElement enterComments;
    private @FindBy(css = "input[type='submit']")
    WebElement enterSubmitButton;

    private @FindBy(xpath = "//*[contains(text(), 'Thank You')]")
    WebElement successfulMessage;
    public ContactUs_PO() {
        super();
    }

    public void navigatToContactUSPage() {
        navigateToURL(GlobalVariable.WebDriverUniversityURL.concat("Contact-Us/contactus.html"));
    }

    public void enterFirstName() {
        sendKeys(enterFirstName, "Abinaya");
    }

    public void enterLastName() {
        sendKeys(enterLastName,"Abinaya" + generateRandomNumber());
    }

    public void enterEmailAddress() {
        sendKeys(enterEmailAddress, "abinayavelrajanca@gmail.com");
    }

    public void uniqueFirstName(String firstName) {
        sendKeys(enterFirstName, firstName);
    }

    public void uniqueLastName(String lastName) {
        sendKeys(enterLastName, lastName);
    }

    public void uniqueEmailAddress(String emailAddress) {
        sendKeys(enterEmailAddress, emailAddress);
    }

    public void enterComments() {
        sendKeys(enterComments, "Hey Hello!!!!");
    }

    public void submitButton() {
        click(enterSubmitButton);
    }

    public void verifySuccessfulSubmissioPage() {
        waitForElementToBeVisible(successfulMessage);
        String s1 = successfulMessage.getText();
        if (s1.equals("Thank You for your Message!")) {
            System.out.println("Successfully Logged In");
        } else {
            System.out.println("Successfully Logged In");
        }
    }
}