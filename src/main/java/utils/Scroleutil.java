package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroleutil{
    WebDriver driver;
    public Scroleutil(WebDriver driver){
        this.driver=driver;
    }
    public void ScrolTo(By Locator){
        WebElement element=driver.findElement(Locator);
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        JS.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
