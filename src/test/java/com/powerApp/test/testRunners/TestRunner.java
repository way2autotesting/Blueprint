package com.powerApp.test.testRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberTagStatement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

@CucumberOptions(features = {"src/test/java/com/powerApp/test/features"}, glue = {"com/powerApp/test/stepdefs"}, format = {"json:target/cucumber-json-report.json",
        "html:target/cucumber-report-html","html:target/test-output/junitreports","junit:target/cucumber-reports/Cucumber.xml"})
public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }


    @Test(dataProvider = "features")
    public void runTest(CucumberFeatureWrapper cucumberFeatureWrapper){
        //new TestNGCucumberRunner(getClass()).runCukes();

        List<CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();
        for (Iterator<CucumberTagStatement> element = elements.iterator(); element.hasNext(); ) {
            //ToDo: Bring the scenario name from excel sheet using the out-of-box library we have in utilities package

            //pass the hardcoded scenario name
            CucumberTagStatement scenarioName = element.next(); //give list of all scenario name
            //if (!scenarioName.getVisualName().equals("Scenario: Check Login with correct username and password")) {
            if (!scenarioName.getVisualName().contains("Scenario:") && !scenarioName.getVisualName().contains("Scenario")) {
                element.remove();
            }
        }
        //todo: insert the feature name
        //ExtendReport.startFeature("");
        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());//ToDo: to run all cucumber features
    }

    @DataProvider
    public Object[][] features() {

        return testNGCucumberRunner.provideFeatures();// ToDo: provide all the features available
    }
  /*  @DataProvider
    public Object[] features(ITestContext context){
        var featureName = testNGCucumberRunner.provideFeatures();
        Object[] getFeature = null;
        for(var item : featureName){
            if(item[0].toString().contains(context.getName())){
                getFeature = item;
            }
        }
        return getFeature;
    }*/


    @AfterClass(alwaysRun = true)
    public void afterClass() {

        testNGCucumberRunner.finish();
    }
}
