package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPromptExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement promptAlertElement = driver.findElement(By.cssSelector("button[id='promptBtn']"));
        promptAlertElement.click();
        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());

        Thread.sleep(1000);
        promptAlert.sendKeys("Hello World!!");
        Thread.sleep(1000);
        promptAlert.accept();
        Thread.sleep(1000);

        driver.quit();
    }
}
