package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition",dryRun = false , monochrome = true ,strict = true,tags = "@Feature",plugin = {"html:REPORT","junit:REPORT\\junitreport.xml","json:REPORT\\jsonreport.json"} )
public class TestRunner {

}
