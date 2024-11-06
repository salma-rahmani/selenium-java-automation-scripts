package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertActivity {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement alertButton = driver.findElement(By.cssSelector("button#alertBtn"));
        Thread.sleep(1000);
        alertButton.click();
        Thread.sleep(1000);

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());


        Thread.sleep(3000);

        simpleAlert.accept();

        driver.quit();


    }
}
