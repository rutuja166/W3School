package com.w3school.qa.cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/features", glue = "stepdefinations", monochrome = true,plugin={"pretty","html:target/cucumber.html","junit:target/cucumber.xml"})
	
	public class TestRunner {

	}

