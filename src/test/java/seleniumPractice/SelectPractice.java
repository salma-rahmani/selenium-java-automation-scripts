package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(url);

        WebElement selectDropdownElement = driver.findElement(By.xpath("//select[@name = 'language']"));

        Select select = new Select(selectDropdownElement);
        Thread.sleep(1000);
        select.selectByIndex(1);
        Thread.sleep(1000);

        select.deselectByVisibleText("C++");

        Thread.sleep(1000);

        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        Thread.sleep(1000);
        driver.quit();


    }
}
