package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ContactUs {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public String generateRandomNumber(){
        return RandomStringUtils.randomNumeric(5);
    }

    @Given("I navigate to WebDriverUniversity - Contact Us Page")
    public void i_navigate_to_web_driver_university_contact_us_page() {
        driver.navigate().to(
                "https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I verify and enter FirstName")
    public void i_verify_and_enter_first_name() {
        driver.findElement(By.name("first_name")).sendKeys("Abinaya");
    }
    @And("I verify and enter LastName")
    public void i_verify_and_enter_last_name() {
        driver.findElement(By.name("last_name")).sendKeys("Abinaya"+generateRandomNumber());
    }
    @And("I verify and enter emailAddress")
    public void i_verify_and_enter_email_address() {
        driver.findElement(By.name("email")).sendKeys("abinayavelrajanca@gmail.com");
    }
    @When("I verify and enter unique FirstName {word}")
    public void i_verify_and_enter_unique_first_name(String firstName) {
        driver.findElement(By.name("first_name")).sendKeys(firstName);
    }
    @And("I verify and enter unique LastName {word}")
    public void i_verify_and_enter_unique_last_name(String lastName) {
        driver.findElement(By.name("last_name")).sendKeys(lastName);
    }
    @And("I verify and enter unique EmailAddress {string}")
    public void i_verify_and_enter_unique_email_address(String emailAddress) {
        driver.findElement(By.name("email")).sendKeys(emailAddress);
    }
    @And("I enter comments")
    public void i_enter_comments() {
        driver.findElement(By.name("message")).sendKeys("Hey Hello!!!!");
    }
    @And("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
    @Then("I verify successful submission page")
    public void i_verify_successful_submission_page() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String s1 = driver.findElement(By.xpath("//*[contains(text(), 'Thank You')]")).getText();
        if(s1.equals("Thank You for your Message!")){
            System.out.println("Successfully Logged In");
        }
        else{
            System.out.println("Successfully Logged In");
        }
    }
}
