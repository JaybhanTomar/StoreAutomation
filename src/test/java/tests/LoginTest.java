package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Account;

public class LoginTest extends BaseTest {

    @Test(enabled = false)
    public void loginTestuser() throws InterruptedException {
        Account Acc=new Account(driver);
        Acc.login("MohitTomar","Mohit@123");
        // I made some changes here
        Thread.sleep(5000);
    }
}
