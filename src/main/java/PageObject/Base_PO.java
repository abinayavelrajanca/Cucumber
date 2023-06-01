package PageObject;

import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.GlobalVariable;

import java.time.Duration;

public class Base_PO extends DriverFactory {
    WebDriver driver = getDriver();

    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }

    public String generateRandomNumber() {
        return RandomStringUtils.randomNumeric(5);
    }

    public void navigateToURL(String URL) {
        driver.get(URL);
    }

    public void sendKeys(By by, String value) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(value);
    }

    public void sendKeys(WebElement element, String value) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(value);
    }

    public void click(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void getTextFromAlert(String expectedAlertText) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, expectedAlertText);
        driver.switchTo().alert().accept();
    }
    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVariable.SHORT_WAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}