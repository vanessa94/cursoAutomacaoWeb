package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resurces/features",
		tags = "@",
		glue = "stesp",
		plugin = {"json:target/reports/CucumberReport.json", "pretty"},
		snippets = SnippetType.CAMELCASE
		)



public class RunnerTest {

}
