package org.tr;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\Reports1\\failed.txt", 
                 glue = "org.sd")
public class TestReRunner {

}
