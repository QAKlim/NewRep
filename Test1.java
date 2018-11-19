package QATests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //dragAndDropp
//        driver.get("http://jqueryui.com/droppable/");
//        driver.switchTo().frame(0);
//        WebElement drog = driver.findElement(By.id("draggable"));
//        WebElement drop = driver.findElement(By.id("droppable"));
//        Actions action = new Actions(driver);
//        action.moveToElement(drog).dragAndDrop(drog,drop).build().perform();
//        System.out.println("dragAndDrop successful");


    }
}
