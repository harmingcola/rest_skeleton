package skeleton.acceptance.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/stories",
        glue = ["src/test/groovy"]
)
class CucumberRunner {
    // Intentionally empty
}
