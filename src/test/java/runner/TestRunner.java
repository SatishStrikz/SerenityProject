package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\java\\features\\MSNHomePage.feature",glue="stepDefinitions",
tags="@MSN")



public class TestRunner  {

}

