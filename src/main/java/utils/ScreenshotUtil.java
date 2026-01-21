package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String testName) {

        // Safety check
        if (driver == null) {
            return null;
        }

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        String screenshotDir = "Screenshots";
        String filePath = screenshotDir + "/" + testName + "_" + System.currentTimeMillis() + ".png";

        try {
            Files.createDirectories(Path.of(screenshotDir));
            Files.copy(src.toPath(), Path.of(filePath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;
    }
}
