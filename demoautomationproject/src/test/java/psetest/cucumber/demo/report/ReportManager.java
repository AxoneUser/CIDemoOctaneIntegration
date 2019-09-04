/*
 * This code contains copyright information which is the proprietary property
 * of SITA Advanced Travel Solutions. No part of this code may be reproduced,
 * stored or transmitted in any form without the prior written permission of
 * SITA Advanced Travel Solutions.
 *
 * Copyright SITA Advanced Travel Solutions 2017-2018
 * All rights reserved.
 */
package psetest.cucumber.demo.report;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.SystemUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import psetest.cucumber.demo.test.base.TestBase;

/**
 * Class to initialize the extent reports.
 * 
 * @author M1030082
 *
 */
public class ReportManager extends TestBase {

	/**
	 * Method which will set the Extent reports reference when the execution will
	 * starts.
	 * 
	 */
	public void extentReportsGeneration() {
		extentReports = new ExtentReports();

		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String fileName = sdf.format(date).replaceAll("/", "_").replaceAll(":", "_").replaceAll(" ", "_");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new File(SystemUtils.getUserDir() + File.separator
				+ "target" + File.separator + "Reports" + File.separator + fileName + ".html"));
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Test Automation results");
		htmlReporter.config().setReportName("Cucumber report");
		extentReports.attachReporter(htmlReporter);
		extentReports.setSystemInfo("User Name", "Mohd Jeeshan");
		extentReports.setSystemInfo("HostName", SystemUtils.getUserHome().toString());

	}

}
