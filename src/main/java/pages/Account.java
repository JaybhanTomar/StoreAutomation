package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Scroleutil;
import utils.waitUtil;

public class Account {
    WebDriver driver;
    waitUtil wait;
    Scroleutil scrole;
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
        this.scrole=new Scroleutil(driver);

    }
    public void login(String UserName,String PassWord) throws InterruptedException {
        scrole.ScrolTo(userName);
        wait.WaitTillVissible(userName).sendKeys(UserName);
        scrole.ScrolTo(Password);
        wait.WaitTillVissible(Password).sendKeys(PassWord);
        scrole.ScrolTo(Login);
        wait.WaitTillClickable(Login).click();
        scrole.ScrolTo(Store);
        wait.WaitTillClickable(Store).click();
    }

}
