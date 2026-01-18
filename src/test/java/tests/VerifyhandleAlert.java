package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.handleAlert;

public class VerifyhandleAlert extends BaseTest {
    @Test
    public void verifyalert() throws InterruptedException {
        handleAlert art=new handleAlert(driver);
        art.clicOkalert();
        Thread.sleep(5000);
    }
}
