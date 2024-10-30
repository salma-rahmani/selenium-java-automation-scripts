package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingSignInTitleUsingIDLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);

        signInElement.click();

        By subTitleLocator = By.className("login__subtitle");
        WebElement subTitleElement = driver.findElement(subTitleLocator);

        String result =  subTitleElement.getText();
        System.out.println(result);

        Thread.sleep(2000);
        driver.quit();

    }
}
