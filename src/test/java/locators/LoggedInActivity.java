package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggedInActivity {

        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//a[@id='signinLink']")).click();

            WebElement usernameElement = driver.findElement(By.xpath("//input[@name='email']"));
            WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
            WebElement loginElement = driver.findElement(By.xpath("//a[@id='signinLink']"));

            usernameElement.sendKeys("rahmani049@gmail.com");
            passwordElement.sendKeys("Password123!!");
            loginElement.click();

            Thread.sleep(2000);

            By elementLocator = By.xpath("//a[@id='orderLink']");
            WebElement element = driver.findElement(elementLocator);

            if (element.isDisplayed()) {
                System.out.println("Displayed");
            } else {
                System.out.println("Not Displayed.");
            }


            driver.quit();
        }
    }


