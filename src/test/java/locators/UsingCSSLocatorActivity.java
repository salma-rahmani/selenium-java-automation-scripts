package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSLocatorActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);


        driver.findElement(By.cssSelector("a.top-nav__btn")).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("selma.1390@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1000);

        String errorMessage = driver.findElement(By.cssSelector("div.error")).getText();

        System.out.println(errorMessage);

        Thread.sleep(1000);

        driver.quit();

    }

}
