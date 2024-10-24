package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();


        By emailLocator = By.name("email");
        WebElement inputElement = driver.findElement(emailLocator);
        inputElement.sendKeys("selma.1390@gmail.com");

        Thread.sleep(1000);

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password786");

        Thread.sleep(1000);

        By loginLocator = By.id("loginBtn");
        WebElement loginElement = driver.findElement(loginLocator);
        loginElement.click();

        Thread.sleep(1000);

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
       String text =  errorElement.getText();
        System.out.println(text);

        Thread.sleep(1000);
        driver.quit();



    }
}

