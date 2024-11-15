package UIComponentsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxTest {
    public static final String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.urlToBe(baseUrl));

        List<WebElement> listOfCheckBoxedElements = driver.findElements(
                By.xpath("//div[@id = 'firstQuestion']//label"));

        for (WebElement element : listOfCheckBoxedElements) {
            System.out.println(element.getText());
            Thread.sleep(100);
            action.click(element).perform();


        }
        Thread.sleep(3000);
        driver.quit();


    }

}
