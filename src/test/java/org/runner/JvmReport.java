package org.runner;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static  void generateJvmReport( String jsonPath) {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\target\\Report\\JvmReport");
		
		Configuration con = new Configuration(f, "Facebook");
		
		con.addClassifications("platformname", "Windows 10");
		con.addClassifications("Browsername", "chrome");
		con.addClassifications("Browser version", "91.0.4472.114 ");
		con.addClassifications("Sprint Number", "10");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		

	}
}

