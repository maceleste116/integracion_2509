package qa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/qa/features"},
        glue= {"qa/stepdefinitions"},
        plugin= {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
        )

public class CucumberTests extends AbstractTestNGCucumberTests {
}
