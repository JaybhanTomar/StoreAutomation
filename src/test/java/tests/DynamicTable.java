package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AddBook;
@Listeners(TestListener.class)
public class DynamicTable extends BaseTest {
    @Test
    public void FindBookName(){
        AddBook book=new AddBook(driver);
        book.BookNameFound("Git Pocket Guide");
    }
}
