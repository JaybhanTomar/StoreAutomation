package utils;

import org.openqa.selenium.WebDriver;

public class HandleAlerts{
    WebDriver driver;
    public HandleAlerts(WebDriver driver){
        this.driver=driver;
    }
    public void acceptalert(){
        driver.switchTo().alert().accept();
    }
    public void rejectalert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void sendTextToAlert(String Text){
        driver.switchTo().alert().sendKeys(Text);
    }
}
