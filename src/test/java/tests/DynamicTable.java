package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Account;
import pages.AddBook;
@Listeners(TestListener.class)
public class DynamicTable extends BaseTest {
    @Test
    public void FindBookName() throws InterruptedException {
        Account Acc=new Account(driver);
        Acc.login("MohitTomar","Mohit@123");
        AddBook book=new AddBook(driver);
        book.BookNameFound("Git Pocket Guide");
        Assert.assertTrue(true);
    }
}
