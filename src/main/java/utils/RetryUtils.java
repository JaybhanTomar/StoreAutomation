package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class RetryUtils {
    WebDriver driver;
    public RetryUtils(WebDriver driver){
        this.driver=driver;
    }
    public void ClickWithRetry(By Locator,int attempt){
        int Count=0;
        while(Count < attempt){
            try{
                driver.findElement(Locator).click();
                return;
            } catch(StaleElementReferenceException e){
                Count++;
            }
        }
        throw new RuntimeException("Element Remain stale after Retry");
    }
}
