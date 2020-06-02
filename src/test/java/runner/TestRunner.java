package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/Features",
        glue= "stepdef",
        plugin = { "pretty", "html:target/cucumber-reports" }
      //  monochrome = true
                )

public class TestRunner {

}
