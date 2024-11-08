package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptSimpleAlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement simpleAlertElement = driver.findElement(By.cssSelector("button[id='alertBtn']"));
        simpleAlertElement.click();
        Thread.sleep(1000);

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());

        Thread.sleep(1000);
        simpleAlert.accept();

        Thread.sleep(1000);

        driver.quit();


    }
}
