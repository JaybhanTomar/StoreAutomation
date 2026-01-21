package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Scroleutil;
import utils.TabHandler;
import utils.waitUtil;

import javax.swing.*;
import java.time.Duration;

public class SwitchWindows {
    WebDriver driver;
    waitUtil wait;
    Scroleutil scrole;
    public SwitchWindows(WebDriver driver){
        this.driver=driver;
        this.wait=new waitUtil(driver);
        this.scrole=new Scroleutil(driver);
    }
    By NewTab=By.xpath("//button[@id='tabButton']");
    public void ClickonTab() throws InterruptedException {

        TabHandler TB=new TabHandler(driver);
        // ✅ STORE parent ONCE
        String parentWindow = TB.getParentWindow();
        scrole.ScrolTo(NewTab);
        wait.WaitTillClickable(NewTab).click();

        // ✅ USE STORED VALUE
        TB.switchToChildWindow(parentWindow);
        scrole.ScrolTo(By.id("sampleHeading"));
        // work in child window
        wait.WaitTillVissible(By.id("sampleHeading"));
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        // ✅ RETURN USING SAME PARENT
        TB.closeChildandReturn(parentWindow);
    }
}
