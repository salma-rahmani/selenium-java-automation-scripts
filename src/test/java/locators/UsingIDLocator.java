package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

        By signInLink = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLink);

        signInElement.click();


    }
}
