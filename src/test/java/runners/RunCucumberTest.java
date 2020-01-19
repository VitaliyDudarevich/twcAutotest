package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        glue = { "classpath:stepDefenitions" },
        plugin = {"html:target/cucumber-html-report"})
public class RunCucumberTest {
}


