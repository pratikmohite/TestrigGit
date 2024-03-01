package Cucumber.StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue= {"StepDefinations"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports"})
public class TestRunner {

}
