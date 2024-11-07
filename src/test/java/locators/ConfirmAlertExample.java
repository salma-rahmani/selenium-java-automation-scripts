package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertExample {
    public static final String baseUrl = "https://retail.tekschool-students.com/selenium/javascript-alerts";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver();
        navigateToUrl(baseUrl);
        maximizeWindow();
        waitFor(1000);

        WebElement alertButton = elementByCssSelector("button#confirmBtn");
        btnClick(alertButton);
        waitFor(1000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.dismiss();

        waitFor(2000);
        driver.quit();


    }

    public static void driver() {
        driver = new ChromeDriver();

    }

    public static void navigateToUrl(String url) {
        driver.get(url);
    }

    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public static void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds);

    }

    public static WebElement elementByCssSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));

    }

    public static void btnClick(WebElement element) {
        element.click();
    }

}
