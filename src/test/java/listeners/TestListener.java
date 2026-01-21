package listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.DriverManager;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    // One ExtentTest per thread
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        // Create a test entry in the report
        ExtentTest extentTest =
                ExtentReportManager.getExtent()
                        .createTest(result.getMethod().getMethodName());

        // Store it safely for this thread
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // Take screenshot
        String path = ScreenshotUtil.takeScreenshot(
                DriverManager.getDtiver(),
                result.getMethod().getMethodName()
        );

        // Log failure + attach screenshot
        test.get().log(Status.FAIL, result.getThrowable());
        test.get().addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        // Write everything to the HTML file
        ExtentReportManager.getExtent().flush();
    }
}
