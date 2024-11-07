package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleTabActivity {
    final static String linkedInUrl = "https://www.linkedin.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(linkedInUrl);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.selenium.dev/', '_blank')");
        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/', '_blank')");
        Thread.sleep(2000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        for (String tab : tabs) {
            driver.switchTo().window(tab);
            System.out.println("Title " + driver.getTitle());
        }

        driver.switchTo().window(tabs.get(1));
        driver.close();

        driver.switchTo().window(tabs.get(0));
        driver.quit();
    }
}
