package MouseAndKeyboardPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RightClickButtonTest {
    public final static String baseUrl = "https://retail.tekschool-students.com/selenium/drag-drop";

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        buttonClickText(wait, driver, action);

        driver.quit();


    }

    public static void buttonClickText(WebDriverWait wait, WebDriver driver, Actions action) {
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[@id='nav-link-amazonprime']/span[text() = 'Prime']")));
        action.contextClick(element).perform();
    }
}
