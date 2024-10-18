import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features"},
                 glue= {"stepDefinitions"},
                  plugin = {"pretty","html:target/test-results.html"},
                  monochrome = true)
public class TestRunner
{
    //this is where I will be running my features..
}
