package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.xml.sax.Locator;
import utils.HandleAlerts;
import utils.Scroleutil;
import utils.waitUtil;

public class handleAlert {
    WebDriver driver;
    waitUtil wait;
    Scroleutil Scrole;
    HandleAlerts alert;
    public handleAlert(WebDriver driver){
        this.driver=driver;
        this.Scrole= new Scroleutil(driver);
        this.alert=new HandleAlerts(driver);
        this.wait = new waitUtil(driver);
    }
    By Aertsmain=By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]");
    By Alert=By.xpath("//span[normalize-space()='Alerts']");
    By alerClick=By.xpath("//button[@id='alertButton']");
    public void clicOkalert(){
       Scrole.ScrolTo(Aertsmain);
       wait.WaitTillClickable(Aertsmain).click();
       Scrole.ScrolTo(Alert);
       wait.WaitTillVissible(Alert).click();
       Scrole.ScrolTo(alerClick);
       wait.WaitTillClickable(alerClick).click();
       wait.waitForAlert();
       alert.acceptalert();
    }
}
