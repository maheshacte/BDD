package runnner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "mercury\\mercurysite.feature",glue="", tags= "@tag1",
	plugin ={"pretty", "html:target/cucumber-reports",
			"json:target/cucumber-reports/report.json"}, monochrome= true)
public class Runner {

}
