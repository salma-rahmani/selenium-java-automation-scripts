package MouseAndKeyboardPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxActivity {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://retail.tekschool-students.com/selenium/checkbox";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> checkBoxButtons = driver.findElements(By.xpath("//div[@class ='flex gap-3']//input"));

        int count = 0;

        for (WebElement checkBox : checkBoxButtons) {
            if (!checkBox.isSelected()) {
                checkBox.click();
                count++;
                System.out.println(checkBox.getAttribute("value"));
            }
        }

        System.out.println("Total checkboxes clicked: " + count);

        Thread.sleep(3000);
        driver.quit();
    }
}
