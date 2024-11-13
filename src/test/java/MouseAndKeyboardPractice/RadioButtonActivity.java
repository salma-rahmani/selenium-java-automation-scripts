package MouseAndKeyboardPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButtonActivity {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://retail.tekschool-students.com/selenium/radio";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);


        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='tshirt']/following-sibling::label"));

        for (WebElement radioButton : radioButtons) {
            System.out.println(radioButton.getText());
        }


        Thread.sleep(3000);

        WebElement largeButton = driver.findElement(By.id("large"));
        largeButton.click();


        Thread.sleep(3000);

        driver.close();
        driver.quit();


    }

}
