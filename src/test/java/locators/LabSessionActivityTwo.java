package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LabSessionActivityTwo {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("Apple");
        Thread.sleep(1000);

        By searchBtnLocator = By.xpath("/html/body/div[1]/div[1]/span[1]/span[1]/span[1]/button");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();

        By allLocators = By.tagName("h4");
        List<WebElement> searchElements = driver.findElements(allLocators);

            int searchItemNumber = searchElements.size();

            if (searchItemNumber == 3) {
                    System.out.println("The number of searched items is equal to three");
            } else {
                    System.out.println("More than three items displayed");
            }

        Thread.sleep(3000);
        driver.quit();

    }
}
