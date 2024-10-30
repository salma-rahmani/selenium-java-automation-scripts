package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorForPlayStationAndVideo {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);


        By videoXPathLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/img");
        WebElement videoElement = driver.findElement(videoXPathLocator);
        videoElement.click();


        By playStationLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]");
        WebElement playStationElement = driver.findElement(playStationLocator);
        playStationElement.click();


        By titleLocator = By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/h1");
        WebElement titleElement = driver.findElement(titleLocator);

        String result =  titleElement.getText();
        System.out.println(result);

        Thread.sleep(1000);

        driver.quit();








    }
}
