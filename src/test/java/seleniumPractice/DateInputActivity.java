package seleniumPractice;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DateInputActivity {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://retail.tekschool-students.com/selenium/inputs";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement dateInputElement = driver.findElement(By.id("dateInput"));
        action.click(dateInputElement).perform();
        LocalDate today = LocalDate.now();
        String correctedDate = today.format(DateTimeFormatter.ofPattern("MM/DD/YYYY"));
        action.sendKeys(correctedDate).perform();
        Thread.sleep(5000);



        driver.quit();


    }
}