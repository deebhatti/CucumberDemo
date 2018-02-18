package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature",
        glue={"stepDefinition"},
        tags={"@regression,@sanity"},
        strict=false,
        plugin={"progress","junit:target/cucumber-junit-report/cuc.xml"},
        monochrome=true

//Adding a comment in line number 16


)
public class TestRunner {

}
