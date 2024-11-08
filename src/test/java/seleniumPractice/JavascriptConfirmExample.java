package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptConfirmExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement confirmAlertElement = driver.findElement(By.cssSelector("button[id='confirmBtn']"));
        confirmAlertElement.click();
        Thread.sleep(1000);

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());

        Thread.sleep(1000);
        confirmAlert.dismiss();
        Thread.sleep(1000);

        driver.quit();
    }
}
