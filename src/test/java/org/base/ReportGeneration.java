package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportGeneration {
	
	public static void convertReports(String json) {
		// Path
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports1");
	    // Configuring the Reports and Details
	    Configuration config = new Configuration(file, "Adactin");
	    config.addClassifications("Platform", "Windows");
	    config.addClassifications("Version", "Windows10");
	    config.addClassifications("Sprint", "4.2");
	    config.addClassifications("Build Number", "AD12234");
	    // Announcing a List to add the file
	    List<String> jsonFiles = new ArrayList<String>();
	    jsonFiles.add(json);
	    // generating Reports
	    ReportBuilder build = new ReportBuilder(jsonFiles, config);
	    build.generateReports();
	

}
	
}
