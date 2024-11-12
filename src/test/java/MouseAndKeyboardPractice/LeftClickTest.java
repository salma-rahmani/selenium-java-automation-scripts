package MouseAndKeyboardPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeftClickTest {
    public static WebElement dropDownXpath;
    public final static String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        urlCheck(wait, baseUrl);

        dropdownSelectXpath(driver, wait, action);
        driver.quit();


    }

    public static void dropdownSelectXpath(WebDriver driver, WebDriverWait wait, Actions action) {
        dropDownXpath = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//select[@name ='language']")));

        action.click(dropDownXpath).perform();


    }
    public static void urlCheck (WebDriverWait wait, String url){
        wait.until(ExpectedConditions.urlToBe(url));


    }
}
