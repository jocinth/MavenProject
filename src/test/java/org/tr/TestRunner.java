package org.tr;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Adactin.feature", 
                 glue = "org.sd",
                 dryRun=false,
                 tags= "@Sanity",
                		 plugin = {
                     			"rerun:src\\test\\resources\\Reports1\\failed.txt",
                     			"junit:src\\test\\resources\\Reports1\\Adactin.xml",
                     			"html:src\\test\\resources\\Reports1",
                     			"json:src\\test\\resources\\Reports1\\Adactin.json" }
                 )

public class TestRunner {
	@AfterClass
	public static void afterExecution() {
		ReportGeneration.convertReports(System.getProperty("user.dir")+"src\\test\\resources\\Reports1\\Adactin.json");
		

	}

}
