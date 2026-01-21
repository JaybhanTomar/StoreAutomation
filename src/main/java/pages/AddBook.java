package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.waitUtil;

import java.util.List;

public class AddBook {
    WebDriver driver;
    waitUtil wait;

    public AddBook(WebDriver driver) {
        this.driver=driver;
        wait = new waitUtil(driver);
    }
    By tableRaws = By.xpath("//div[@class='rt-tbody']/div");

    public Boolean BookNameFound(String BookName) {
        List<WebElement> raw = driver.findElements(tableRaws);
        for(WebElement r:raw){
            List<WebElement> col=r.findElements(By.className("rt-td"));
            wait.WaitTillVissible(By.className("rt-td"));
            if(col.size()>0){
                String actualbookName=col.get(1).getText();
                if(actualbookName.contains(BookName)){
                    col.get(1).click();
                    return true;
                }
            }
        }
        return false;
    }

}

