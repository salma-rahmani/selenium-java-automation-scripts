package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginErrorValidationUsingAbsoluteXPath {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By signInButtonLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInButtonLocator);
        signInElement.click();


        By inputLocator = By.id("email");
        WebElement inputElement = driver.findElement(inputLocator);
        inputElement.sendKeys("selma.1390@gmail.com");
        Thread.sleep(1000);

        By passwordLocator = By.id("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password786");
        Thread.sleep(1000);

        By loginLocator = By.xpath("/html/body/main/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
        WebElement loginElement = driver.findElement(loginLocator);
        signInElement.click();

        Thread.sleep(1000);

        By errorLocator = By.className("ant-alert-message");
        WebElement errorElement = driver.findElement(errorLocator);
        String text =  errorElement.getText();
        System.out.println(text);

        Thread.sleep(2000);

        driver.quit();


    }
}
