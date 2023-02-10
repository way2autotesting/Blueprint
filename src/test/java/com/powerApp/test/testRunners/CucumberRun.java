package com.powerApp.test.testRunners;

/**
 * Created by Ibi on 17/01/2023.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/powerApp/test/features",
        plugin ="json:target/jsonReports/cucumber-report.json",
        tags="@test",
        glue= {"com/powerApp/test/stepdefs"}
)
public class CucumberRun {
}
