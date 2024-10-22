package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();

        By signInLink = By.id("signinLink");

        WebElement signInElement = driver.findElement(signInLink);

        signInElement.click();

        By createAccountLink = By.id("newAccountBtn");
        WebElement createAccountElement = driver.findElement(createAccountLink);

        createAccountElement.click();

        Thread.sleep(3000);

        driver.quit();








    }
}

