package org.sd;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		launchMethod("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitlyWaitMethod(30);

	}
	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "img/png");
		quitMethod();

	}
	
	

	}
	


