package UIComponentsTest;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButtonTest {
    public static final String baseUrl = "https://retail.tekschool-students.com/selenium/radio";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.urlToBe(baseUrl));

        List<WebElement> listOfRadioButtons = driver.findElements(
                By.xpath("//div[@class ='flex gap-3']//input[@name ='contact']"));
        Thread.sleep(3000);
        for (WebElement element : listOfRadioButtons) {
            System.out.println(element.getAttribute("value"));
            Thread.sleep(3000);

        }
        WebElement emailButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("email"))));
        action.click(emailButton).perform();
        Thread.sleep(3000);

        driver.quit();

    }

}
