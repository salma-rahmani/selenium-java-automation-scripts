package MouseAndKeyboardPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDropActionTest {
    public final static String baseUrl = "https://retail.tekschool-students.com/selenium/drag-drop";

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        dragAndDropXpath(wait, driver, action);
        driver.quit();
    }

    public static void dragAndDropXpath(WebDriverWait wait, WebDriver driver, Actions action) throws InterruptedException{
        WebElement sourceElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@data-rbd-draggable-id='1']")));
        WebElement targetElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@data-rbd-droppable-id='2']")));

        action.clickAndHold(sourceElement).
                moveByOffset(0, 10).
                moveToElement(targetElement).
                release().
                perform();
        Thread.sleep(4000);

    }
}
