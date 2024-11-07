package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
    final static String facebookUrl = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(facebookUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.id("email"));

        Actions actions = new Actions(driver);


        for (char character : "username".toCharArray()) {
            actions.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        actions.keyDown(Keys.TAB).perform();
        Thread.sleep(1000);

        for (char character : "PASSWORD".toCharArray()) {
            actions.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}

