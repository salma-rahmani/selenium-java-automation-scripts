package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectActivity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement selectDropdownElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name = 'language']")));
        Select selectDropdown = new Select(selectDropdownElement);
        selectDropdown.selectByIndex(2);

        String selectedOptionText = selectDropdown.getFirstSelectedOption().getText();
        System.out.println( selectedOptionText);

        driver.quit();
    }
}
