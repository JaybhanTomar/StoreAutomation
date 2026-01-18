package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class TabHandler {
    WebDriver driver;
    public TabHandler(WebDriver driver){
        this.driver=driver;
    }
    public String getParentWindow(){
        return driver.getWindowHandle();
    }
    public void switchToChildWindow(String ParentWindow){
        Set<String> allWindow=driver.getWindowHandles();
        for(String window:allWindow){
            if(!window.equals(ParentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
    }
    public void closeChildandReturn(String ParentWindow){
        driver.close();
        driver.switchTo().window(ParentWindow);
    }
}
