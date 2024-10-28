package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1Week2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        By searchInputLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("TV");
        Thread.sleep(1000);

        By searchBtnLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img")).click();
        String title = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h1")).getText();
        System.out.println( title);
        Thread.sleep(1000);

        driver.quit();
    }
}
