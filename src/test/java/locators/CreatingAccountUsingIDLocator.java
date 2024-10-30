package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingAccountUsingIDLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

        By signInLink = By.id("signinLink");

        WebElement signInElement = driver.findElement(signInLink);

        signInElement.click();

        By createAccountLink = By.id("newAccountBtn");
        WebElement createAccountElement = driver.findElement(createAccountLink);

        createAccountElement.click();








    }
}