package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpAndCheckUsername {
    /*
      On New Retail App https://dev.retail.tekschool-students.com/
       Navigate to Sing In page then go to sign up page.
       Fill up the form and Submit then Sign in with newly registered user
       and Validate Full Name display on User Profile Drop Down
    */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text() = 'Sign in']")))
                .click();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class = 'ant-form-item-control-input-content']/div/button[2]/a")))
                .click();

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("firstName"))).sendKeys("Salma");
        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("lastName"))).sendKeys("Rahmani");

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("email"))).sendKeys("example101@gmail.com");

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("password"))).sendKeys("Password123!!");

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("confirmPassword"))).sendKeys("Password123!!");

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class='ant-form-item-control-input-content']/div/button")))
                .click();

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[name = 'email']"))).sendKeys("example101@gmail.com");
        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[name = 'password']"))).sendKeys("Password123!!");
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class = 'ant-form-item-control-input-content']/div/button/span"))).click();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("svg[data-icon='user']"))).click();

        String username = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//ul//div[@class='ant-space-item']"))).getText();

        if (username.equalsIgnoreCase("Salma Rahmani")) {
            System.out.println("Test passed");
        } else System.out.println("Test not passed");
        driver.quit();

    }
}
