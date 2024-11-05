package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitActivity {
    public static void main(String[] args) {
         /*
    Sign In to retail app with your credentials
    Then go to account page and update phone number
    Make sure Success Message Toast is displayed
    NOTE: Apply Implicit and Explicit wait .

    Hint-> WebElement have clear() which should use before SendKey to input element
     */
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Sign in']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='email']")))
                .sendKeys("rahmani049@gmail.com");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='password']")))
                .sendKeys("Password123!!");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button[type='submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#accountLink")))
                .click();

        WebElement phoneNumberElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='phoneNumber']")));
        phoneNumberElement.clear();
        phoneNumberElement.sendKeys("7676768989");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#personalUpdateBtn"))).click();
        WebElement toastMessageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div.Toastify__toast-container")));

        System.out.println(toastMessageElement.isDisplayed());

        driver.quit();






    }
}
