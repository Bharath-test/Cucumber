package org.steps;

import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before(order=2)

	private void beforeScenario() {
		launchBrowser();

	}

	@Before(order=1)

	private void beforeMax() {
		maxBrowser();

	}

	@Before(order=1)

	private void beforeScreenshot() {
		System.out.println("Before Screenshot");

	}

	@After(order=2)
	private void afterScenario() {
		CloseBrowser();

	}

	@After(order=1)

	private void afterScreenshot(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			
			String name = s.getName();
			String filename = name.replace(" ", "_");
			takeSnap(filename);
			System.out.println("After Screenshot");
			
		}
		

	}

}
