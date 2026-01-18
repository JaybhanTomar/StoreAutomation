package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.waitUtil;

public class Account {
    WebDriver driver;
    waitUtil wait;

    By userName= By.xpath("//input[@id='userName']");
    By Password=By.xpath("//input[@id='password']");
    By NewUser=By.xpath("//button[@id='newUser']");
    By FirstName=By.xpath("//input[@id='firstname']");
    By LastName=By.xpath("//input[@id='lastname']");
    By Register=By.xpath("//button[@id='register']");
    By Login=By.xpath("//button[@id='login']");
    By Store=By.xpath("//button[@id='gotoStore']");
    public Account(WebDriver driver){
        this.driver=driver;
        this.wait=new waitUtil(driver);
    }
    public void login(String UserName,String PassWord) throws InterruptedException {
        wait.WaitTillVissible(userName).sendKeys(UserName);
        wait.WaitTillVissible(Password).sendKeys(PassWord);
        wait.WaitTillClickable(Login).click();
        wait.WaitTillClickable(Store).click();
    }

}
