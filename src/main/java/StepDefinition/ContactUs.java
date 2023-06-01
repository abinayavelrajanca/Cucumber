package StepDefinition;

import PageObject.Base_PO;
import PageObject.ContactUs_PO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUs extends Base_PO {

    private final ContactUs_PO contactUsPO;
    public  ContactUs(ContactUs_PO contactUsPO){
        this.contactUsPO = contactUsPO;
    }

    @Given("I navigate to WebDriverUniversity - Contact Us Page")
    public void i_navigate_to_web_driver_university_contact_us_page() {
        contactUsPO.navigatToContactUSPage();
    }

    @When("I verify and enter FirstName")
    public void i_verify_and_enter_first_name() {
        contactUsPO.enterFirstName();
    }

    @And("I verify and enter LastName")
    public void i_verify_and_enter_last_name() {
        contactUsPO.enterLastName();
    }

    @And("I verify and enter emailAddress")
    public void i_verify_and_enter_email_address() {
        contactUsPO.enterEmailAddress();
    }
    @When("I verify and enter unique FirstName {word}")
    public void i_verify_and_enter_unique_first_name(String firstName) {
        contactUsPO.uniqueFirstName(firstName);
    }

    @And("I verify and enter unique LastName {word}")
    public void i_verify_and_enter_unique_last_name(String lastName) {
        contactUsPO.uniqueLastName(lastName);
    }

    @And("I verify and enter unique EmailAddress {string}")
    public void i_verify_and_enter_unique_email_address(String emailAddress) {
        contactUsPO.uniqueEmailAddress(emailAddress);
    }

    @And("I enter comments")
    public void i_enter_comments() {
        contactUsPO.enterComments();
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        contactUsPO.submitButton();
    }

    @Then("I verify successful submission page")
    public void i_verify_successful_submission_page() {
        contactUsPO.verifySuccessfulSubmissioPage();
    }
}