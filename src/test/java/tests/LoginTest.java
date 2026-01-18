package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Account;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestuser() throws InterruptedException {
        Account Acc=new Account(driver);
        Acc.login("MohitTomar","Mohit@123");
        Thread.sleep(5000);
    }
}
