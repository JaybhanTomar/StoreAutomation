package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SwitchWindows;
@Listeners(TestListener.class)
public class TestTabWindow extends BaseTest {
    @Test
    public void Verifywindows() throws InterruptedException {
        SwitchWindows sw=new SwitchWindows(driver);
        sw.ClickonTab();
       // Assert.assertFalse(driver.findElement(By.id("sampleHeading")).isDisplayed());
    }
}
