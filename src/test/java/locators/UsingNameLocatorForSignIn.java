package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocatorForSignIn {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);

        signInElement.click();


        By inputLocator = By.name("email");
        WebElement inputElement = driver.findElement(inputLocator);
        inputElement.sendKeys("selma.1390@gmail.com");
        Thread.sleep(2000);

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password786");
        Thread.sleep(2000);

        By loginLocator = By.id("loginBtn");
        WebElement loginElement = driver.findElement(loginLocator);

        signInElement.click();

        Thread.sleep(2000);

        driver.quit();


    }
}
