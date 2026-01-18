package listeners;
import base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        String TestName = result.getMethod().getMethodName();
        ScreenshotUtil.TakeScreenshot(driver, TestName);
    }
}
