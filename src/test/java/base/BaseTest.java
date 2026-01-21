package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;

public class BaseTest {
   public WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        DriverManager.setDriver(driver);
        DriverManager.getDtiver().manage().window().maximize();
        DriverManager.getDtiver().get("https://demoqa.com/login");
    }
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            DriverManager.getDtiver().quit();
            DriverManager.unload();
        }
    }
}
