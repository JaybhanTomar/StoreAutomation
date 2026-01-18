package TestDirectMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
    public static void main(String []args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        WebElement parentIfram=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(parentIfram);
        driver.switchTo().frame(0);
        String Text=driver.findElement(By.tagName("p")).getText();
        System.out.println(Text);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }
}
