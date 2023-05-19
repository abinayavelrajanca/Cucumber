package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:Feature", glue = "StepDefinition",
                tags = "@contact-us", monochrome = true, dryRun = false,
                plugin = {"pretty", "html:target/cucumberHTML.html"})
public class MainRunner extends AbstractTestNGCucumberTests {
}
