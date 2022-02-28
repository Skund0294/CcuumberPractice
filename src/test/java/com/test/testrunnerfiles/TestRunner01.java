package com.test.testrunnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/com/test/featurefiles" }, glue = {
		"com/test/stepdefs" }, monochrome = true)
public class TestRunner01 {

}