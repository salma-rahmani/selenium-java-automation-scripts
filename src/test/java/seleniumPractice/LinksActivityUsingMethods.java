package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinksActivityUsingMethods {

    public static void clickLink(WebDriver driver, WebDriverWait wait, String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://retail.tekschool-students.com/selenium/links";
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(url));

        clickLink(driver, wait, "//a[text() = 'same tab']");
        clickLink(driver, wait, "//a[text() = 'new tab with html']");
        clickLink(driver, wait, "//a[text() = 'new window with js']");

        Map<String, String> linksMap = new HashMap<>();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String linkText = link.getText();
            String linkHref = link.getAttribute("href");
            linksMap.put(linkText, linkHref);
        }

        for (Map.Entry<String, String> entry : linksMap.entrySet()) {
            System.out.println("Link Text: " + entry.getKey() + " URL: " + entry.getValue());
        }

        driver.quit();
    }
}
