package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement projectElement = driver.findElement(By.linkText("Projects"));
        action.moveToElement(projectElement).perform();
        Thread.sleep(1000);

        WebElement downloadElement = driver.findElement(By.linkText("Downloads"));
        action.contextClick(downloadElement).perform();
        Thread.sleep(1000);


        WebElement leftClickElement = driver.findElement(By.linkText("Documentation"));
        action.click(leftClickElement).perform();
        Thread.sleep(1000);

        driver.quit();
    }
}
