package TestDirectMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeTest {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        WebElement fram=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(fram);
        WebElement frameText=driver.findElement(By.id("sampleHeading"));
        String heading=frameText.getText();
        System.out.println(heading);
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
