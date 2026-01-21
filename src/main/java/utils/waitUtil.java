package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitUtil {
    WebDriver driver;
    WebDriverWait wait;
    public waitUtil(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        }
    public WebElement WaitTillVissible(By Locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
    }
    public WebElement WaitTillClickable(By Locator){
        return wait.until(ExpectedConditions.elementToBeClickable(Locator));
    }
    public void WaitTillInvisible(By Locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
    }
    public void waitForAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
    }

}

