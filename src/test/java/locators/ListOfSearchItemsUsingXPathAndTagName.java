package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class ListOfSearchItemsUsingXPathAndTagName {
    public static void main(String[] args) throws InterruptedException {
            EdgeDriver driver = new EdgeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);

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
            System.out.println(searchItemNumber);

            if (searchItemNumber == 3) {
                    System.out.println("The number of searched items is equal to three");
            } else {
                    System.out.println("More than three items displayed");
            }

        Thread.sleep(10000);
        driver.quit();

    }
}
