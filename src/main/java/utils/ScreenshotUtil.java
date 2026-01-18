package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {
    public static String TakeScreenshot(WebDriver driver,String TestName){
        TakesScreenshot TS=(TakesScreenshot) driver;
        File src=TS.getScreenshotAs(OutputType.FILE);
        String Path="Screenshot/"+TestName+".png";
        try{
            Files.createDirectories(new File("Screenshot").toPath());
            Files.copy(src.toPath(),new File(Path).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Path;
    }
}
