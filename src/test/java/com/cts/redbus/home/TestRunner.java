package com.cts.redbus.home;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dinesh\\eclipse-workspace\\RedBusProject\\src\\test\\resources\\Feature\\HomePage.feature",
glue="com.cts.redbus.home",plugin= {"html:target"},dryRun=false
	)
public class TestRunner {

}
