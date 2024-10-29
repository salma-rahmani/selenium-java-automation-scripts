package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2UsingRelativeXPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        By searchInputLocator = By.xpath("//input[@class='search__input']");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("Keyboard");
        Thread.sleep(1000);

        By searchBtnLocator = By.xpath("//button[@class='search__btn']");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='bg-gray-100']/div/div/img[@alt='NPET K10 Gaming Keyboard']")).click();
        String title = driver.findElement(By.xpath("//h1[@class='product__name']")).getText();
        System.out.println( title);
        Thread.sleep(1000);

        driver.quit();
    }
}

