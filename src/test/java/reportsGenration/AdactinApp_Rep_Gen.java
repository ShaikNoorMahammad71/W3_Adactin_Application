package reportsGenration;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import reusableBase.BaseClass;

public class AdactinApp_Rep_Gen implements ITestListener {	
	public ExtentSparkReporter reporter;

	public ExtentReports extentR;
	public ExtentTest test;

	public void onStart(ITestContext it) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		String timestamp = dateFormat.format(new Date());
		String path = "Adactin_" + timestamp + ".html";
		String reportPath = "C:\\new eclipse\\eclipse-workspace\\AdactinProject\\Adactin_Re_Gen.file\\" + path;
		reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Application Open");
		reporter.config().setTheme(Theme.DARK);

		extentR = new ExtentReports();

		extentR.attachReporter(reporter);
		extentR.setSystemInfo("UserName", "NooR");
		extentR.setSystemInfo("Sprint", "1");
		extentR.setSystemInfo("HostName", "Local host");
		extentR.setSystemInfo("OS", "Windows10");
		extentR.setSystemInfo("Browser", "Chrome");
		extentR.setSystemInfo("Environment", "Qa");


	}
	public void onTestSuccess(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		try {
			BaseClass openADAd = new BaseClass();
			openADAd.CaptureScreenshot(tr.getName().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}
	public void onTestSkipped(ITestResult tr) {
		test = extentR.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));



	}
	public void onFinish(ITestContext con) {
		extentR.flush();

	}
}
