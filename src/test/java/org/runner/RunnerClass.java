package org.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.steps"},dryRun= false,monochrome=true,tags= {"@login"}, 
       plugin = {"pretty",
    		   
    		   "html:target",
    		   "json:target\\Report\\output.json",
    		   "junit:target\\Report\\abc.xml",
    		   "rerun:src\\test\\resources\\Rerun\\failed.txt"
    		   
       })


public class RunnerClass{
	
@AfterClass
public static void jvmReportGeneration() {
	
	JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\target\\Report\\output.json");
		

	}
	
	

}
