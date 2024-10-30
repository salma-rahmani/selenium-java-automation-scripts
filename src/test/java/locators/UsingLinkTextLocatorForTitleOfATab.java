package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextLocatorForTitleOfATab {

    /*Navigate to https://www.bbc.com/ Then Click on business linkThen Get The text
     of Page Title and print it.Quit browser  */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);


        By businessTabLocator = By.linkText("Business");
        WebElement businessTabElement = driver.findElement(businessTabLocator);
        businessTabElement.click();

        Thread.sleep(3000);

        By pageTitleLocator = By.className("juQBdA");
        WebElement titleElement = driver.findElement(pageTitleLocator);

        String result =  titleElement.getText();
        System.out.println(result);

        Thread.sleep(2000);
        driver.quit();


    }
}
