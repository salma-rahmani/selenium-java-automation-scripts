package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckingUsernameIdDisplayedInDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Sign in']"))).click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("quinn.turner@example.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("password123");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type= 'submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[data-icon='user']"))).click();

        String username = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul//div[@class='ant-space-item']"))).getText();

        if (username.equalsIgnoreCase("Quinn Turner")) {
            System.out.println("Test passed");
        } else System.out.println("Test not passed");
        driver.quit();


    }
}
